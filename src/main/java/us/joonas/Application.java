package us.joonas;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.spring.security.NavigationAccessControlConfigurer;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The entry point of the Spring Boot application.
 *
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 *
 */
@SpringBootApplication
@Theme(value = "status")
public class Application implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    static NavigationAccessControlConfigurer navigationAccessControlConfigurerCustomizer() {
        return new NavigationAccessControlConfigurer()
                .withAnnotatedViewAccessChecker()
                .withLoginView("/oauth2/authorization/control-center");
    }
}
