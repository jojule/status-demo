package us.joonas.views.dashboard;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import us.joonas.views.MainLayout;

@Route(value = "report", layout = MainLayout.class)
@PageTitle("Report")
@RolesAllowed("admin")
public class Report extends HorizontalLayout {

    public Report() {
        VerticalLayout verticallayout = new VerticalLayout();
        verticallayout.add(new H1("This report views is private"));
        verticallayout.add(cards());
        add(verticallayout);

    }

    private static UnorderedList cards() {
        UnorderedList unorderedlist = new UnorderedList();
        unorderedlist.getStyle().set("gridTemplateColumns", "repeat(auto-fill, minmax(200px, 1fr))");
        unorderedlist.addClassNames(LumoUtility.Gap.MEDIUM, LumoUtility.Display.GRID, LumoUtility.ListStyleType.NONE, LumoUtility.Margin.NONE, LumoUtility.Padding.NONE);
        ListItem listitem = new ListItem();
        Div div = new Div();
        div.addClassNames(LumoUtility.Background.BASE, LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Overflow.HIDDEN, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.SMALL);
        Image image = new Image();
        image.setSrc("https://images.unsplash.com/photo-1470770841072-f978cf4d019e?w=640");
        image.setAlt("Architectural photography of brown wooden house – Luca Bravo");
        image.addClassNames(LumoUtility.MaxWidth.FULL);
        div.add(image);
        Div div2 = new Div();
        div2.addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Padding.MEDIUM);
        Span cardTitle = new Span("Card title");
        cardTitle.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        div2.add(cardTitle);
        Span loremIpsumDolorSitAm = new Span("Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.");
        loremIpsumDolorSitAm.addClassNames(LumoUtility.FontSize.SMALL, LumoUtility.TextColor.SECONDARY);
        div2.add(loremIpsumDolorSitAm);
        div.add(div2);
        Div div3 = new Div();
        div3.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.SMALL, "pb-s", "px-s");
        Button button = new Button("Button");
        button.setThemeName("tertiary");
        button.addClassNames(LumoUtility.Margin.NONE);
        div3.add(button);
        Button button2 = new Button("Button");
        button2.setThemeName("tertiary");
        button2.addClassNames(LumoUtility.Margin.NONE);
        div3.add(button2);
        div.add(div3);
        listitem.add(div);
        unorderedlist.add(listitem);
        ListItem listitem2 = new ListItem();
        Div div4 = new Div();
        div4.addClassNames(LumoUtility.Background.BASE, LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Overflow.HIDDEN, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.SMALL);
        Image image2 = new Image();
        image2.setSrc("https://images.unsplash.com/photo-1470770841072-f978cf4d019e?w=640");
        image2.setAlt("Architectural photography of brown wooden house – Luca Bravo");
        image2.addClassNames(LumoUtility.MaxWidth.FULL);
        div4.add(image2);
        Div div5 = new Div();
        div5.addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Padding.MEDIUM);
        Span cardTitle2 = new Span("Card title");
        cardTitle2.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        div5.add(cardTitle2);
        Span loremIpsumDolorSitAm2 = new Span("Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.");
        loremIpsumDolorSitAm2.addClassNames(LumoUtility.FontSize.SMALL, LumoUtility.TextColor.SECONDARY);
        div5.add(loremIpsumDolorSitAm2);
        div4.add(div5);
        Div div6 = new Div();
        div6.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.SMALL, "pb-s", "px-s");
Button button3 = new Button("Foo");
        button3.setThemeName("tertiary");
        button3.addClassNames(LumoUtility.Margin.NONE);
        div6.add(button3);
        Button button4 = new Button("Button");
        button4.setThemeName("tertiary");
        button4.addClassNames(LumoUtility.Margin.NONE);
        div6.add(button4);
        div4.add(div6);
        listitem2.add(div4);
        unorderedlist.add(listitem2);
        ListItem listitem3 = new ListItem();
        Div div7 = new Div();
        div7.addClassNames(LumoUtility.Background.BASE, LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Overflow.HIDDEN, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.SMALL);
        Image image3 = new Image();
        image3.setSrc("https://images.unsplash.com/photo-1470770841072-f978cf4d019e?w=640");
        image3.setAlt("Architectural photography of brown wooden house – Luca Bravo");
        image3.addClassNames(LumoUtility.MaxWidth.FULL);
        div7.add(image3);
        Div div8 = new Div();
        div8.addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Padding.MEDIUM);
        Span cardTitle3 = new Span("Card title");
        cardTitle3.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        div8.add(cardTitle3);
        Span loremIpsumDolorSitAm3 = new Span("Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.");
        loremIpsumDolorSitAm3.addClassNames(LumoUtility.FontSize.SMALL, LumoUtility.TextColor.SECONDARY);
        div8.add(loremIpsumDolorSitAm3);
        div7.add(div8);
        Div div9 = new Div();
        div9.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.SMALL, "pb-s", "px-s");
        Button button5 = new Button("Button");
        button5.setThemeName("tertiary");
        button5.addClassNames(LumoUtility.Margin.NONE);
        div9.add(button5);
        Button button6 = new Button("Button");
        button6.setThemeName("tertiary");
        button6.addClassNames(LumoUtility.Margin.NONE);
        div9.add(button6);
        div7.add(div9);
        listitem3.add(div7);
        unorderedlist.add(listitem3);
        ListItem listitem4 = new ListItem();
        Div div10 = new Div();
        div10.addClassNames(LumoUtility.Background.BASE, LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Overflow.HIDDEN, LumoUtility.BorderRadius.MEDIUM, LumoUtility.BoxShadow.SMALL);
        Image image4 = new Image();
        image4.setSrc("https://images.unsplash.com/photo-1470770841072-f978cf4d019e?w=640");
        image4.setAlt("Architectural photography of brown wooden house – Luca Bravo");
        image4.addClassNames(LumoUtility.MaxWidth.FULL);
        div10.add(image4);
        Div div11 = new Div();
        div11.addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN, LumoUtility.Padding.MEDIUM);
        Span cardTitle4 = new Span("Card title");
        cardTitle4.addClassNames(LumoUtility.FontWeight.SEMIBOLD, LumoUtility.FontSize.LARGE);
        div11.add(cardTitle4);
        Span loremIpsumDolorSitAm4 = new Span("Lorem ipsum dolor sit amet, consectetur adipisci elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua.");
        loremIpsumDolorSitAm4.addClassNames(LumoUtility.FontSize.SMALL, LumoUtility.TextColor.SECONDARY);
        div11.add(loremIpsumDolorSitAm4);
        div10.add(div11);
        Div div12 = new Div();
        div12.addClassNames(LumoUtility.Display.FLEX, LumoUtility.Gap.SMALL, "pb-s", "px-s");
        Button button7 = new Button("Button");
        button7.setThemeName("tertiary");
        button7.addClassNames(LumoUtility.Margin.NONE);
        div12.add(button7);
        Button button8 = new Button("Button");
        button8.setThemeName("tertiary");
        button8.addClassNames(LumoUtility.Margin.NONE);
        div12.add(button8);
        div10.add(div12);
        listitem4.add(div10);
        unorderedlist.add(listitem4);
        return unorderedlist;
    }

}
