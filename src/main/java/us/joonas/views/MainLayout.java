package us.joonas.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.server.menu.MenuConfiguration;
import com.vaadin.flow.spring.security.AuthenticationContext;
import com.vaadin.flow.theme.lumo.LumoUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.authentication.event.LogoutSuccessEvent;
import org.vaadin.lineawesome.LineAwesomeIcon;
import us.joonas.views.dashboard.DashboardView;
import us.joonas.views.dashboard.Report;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    private H1 viewTitle;
    private AuthenticationContext authenticationContext;
    private Button logoutButton, loginButton;


    public MainLayout(@Autowired AuthenticationContext authenticationContext) {

        this.authenticationContext = authenticationContext;

        logoutButton = new Button("Logout", click -> authenticationContext.logout());
        loginButton = new Button("Login", event -> {
            getUI().ifPresent(ui -> ui.getPage().setLocation("/oauth2/authorization/control-center"));
        });

        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
}

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");

        viewTitle = new H1();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        Span appName = new Span("Status");
        appName.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        Header header = new Header(appName);

        Scroller scroller = new Scroller(createNavigation());

        addToDrawer(header, scroller, createFooter());
    }

    private SideNav createNavigation() {
        SideNav nav = new SideNav();

        nav.addItem(new SideNavItem("Dashboard", DashboardView.class, LineAwesomeIcon.CHART_AREA_SOLID.create()));
        nav.addItem(new SideNavItem("Report", Report.class, LineAwesomeIcon.CHART_PIE_SOLID.create()));

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

        layout.add(loginButton);
        layout.add(logoutButton);
        updateLoginLogoutButtons();

        return layout;
    }

    private void updateLoginLogoutButtons() {
        if (authenticationContext.isAuthenticated()) {
            loginButton.setVisible(false);
            logoutButton.setVisible(true);
        } else {
            loginButton.setVisible(true);
            logoutButton.setVisible(false);
        }
    }

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent success) {
        updateLoginLogoutButtons();
    }

    @EventListener
    public void onSuccess(LogoutSuccessEvent success) {
        updateLoginLogoutButtons();
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        return MenuConfiguration.getPageHeader(getContent()).orElse("");
    }
}
