public class FeedbackHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.GENERAL_FEEDBACK) {
            System.out.println("Thank you for GENERAL FEEDBACK " + message.getSenderEmail() + " feedback: " + message.getContent());
        } else if (nextHandler != null) {
            System.out.println("Forwarding  feedback to appropriate department.. ");
            nextHandler.handle(message);
        }
    }
}