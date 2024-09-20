public class Service {

    private MessageService messageService;

    // Constructor Injection
    public Service(MessageService messageService) {
        this.messageService = messageService;
    }

    // No-argument constructor for setter injection
    public Service() {
    }

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}

