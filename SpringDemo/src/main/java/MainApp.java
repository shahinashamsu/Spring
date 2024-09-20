import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring context using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the Bean from the Spring container (constructor injection)
        Service constructorInjectedService = context.getBean("constructorInjectedService", Service.class);
        constructorInjectedService.printMessage();

        // Get the Bean from the Spring container (setter injection)
        Service setterInjectedService = context.getBean("setterInjectedService", Service.class);
        setterInjectedService.printMessage();

    }
}

