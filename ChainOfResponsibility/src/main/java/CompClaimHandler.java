public class CompClaimHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Message message) {
        if (message.getType() == Message.MessageType.COMPENSATION_CLAIM) {
            System.out.println("YOUR COMPENSATION REQUEST IS UNDER REVIEW " + message.getSenderEmail() + " feedback: " + message.getContent());
        } else if (nextHandler != null) {
            System.out.println("Forwarding  feedback to appropriate department... ");
            nextHandler.handle(message);
        }
    }
}