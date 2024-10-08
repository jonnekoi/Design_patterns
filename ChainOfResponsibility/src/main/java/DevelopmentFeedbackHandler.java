public class DevelopmentFeedbackHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("THANK YOU FOR DEVELOPMENT SUGGESTION " + message.getSenderEmail() + " feedback: " + message.getContent());
        } else if (nextHandler != null) {
            System.out.println("Forwarding  feedback to appropriate department...");
            nextHandler.handle(message);
        }
    }
}