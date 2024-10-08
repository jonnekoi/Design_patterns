public class Main {
    public static void main(String[] args) {

        Handler compensationHandler = new CompClaimHandler();
        Handler contactHandler = new ContactHandler();
        Handler suggestionHandler = new DevelopmentFeedbackHandler();
        Handler generalFeedbackHandler = new FeedbackHandler();


        contactHandler.setNextHandler(generalFeedbackHandler);
        generalFeedbackHandler.setNextHandler(compensationHandler);
        compensationHandler.setNextHandler(suggestionHandler);


        // COMMENTED for clearer view


        //Message message1 = new Message(Message.MessageType.COMPENSATION_CLAIM, "Want money BACK for BROKEN PRODUCT", "COMPENSATION@mail.com");
        //Message message2 = new Message(Message.MessageType.CONTACT_REQUEST, "Contact me about order. Where is it?", "CONTACT@mail.com");
        Message message3 = new Message(Message.MessageType.DEVELOPMENT_SUGGESTION, "Add apple pay payment option", "DEVELOPMENT@mail.com");
        //Message message4 = new Message(Message.MessageType.GENERAL_FEEDBACK, "Good service!", "GENERAL@mail.com");

        //contactHandler.handle(message1);
        //contactHandler.handle(message2);
        contactHandler.handle(message3);
        //contactHandler.handle(message4);
    }
}
