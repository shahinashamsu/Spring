import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Define a bean for HelloWorld
    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }
        // Define a bean for Service using constructor injection
        @Bean
        public Service constructorInjectedService() {
            return new Service(messageService());
        }

        // Define a bean for Service using setter injection
        @Bean
        public Service setterInjectedService() {
            Service service = new Service();
            service.setMessageService(messageService());
            return service;
    }
}

