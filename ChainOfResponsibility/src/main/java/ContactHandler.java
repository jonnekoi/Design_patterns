public class ContactHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.CONTACT_REQUEST) {
            System.out.println("OUR CUSTOMER SERVICE WILL REACH OUT TO YOU IN THE NEXT DAYS " + message.getSenderEmail() + " feedback: " + message.getContent());
        } else if (nextHandler != null) {
            System.out.println("Forwarding  feedback to appropriate department... ");
            nextHandler.handle(message);
        }
    }
}