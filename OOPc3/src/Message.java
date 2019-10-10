public class Message
{
    private String sender, recipient, messageText;

    public Message()
    {
        this.sender = "sender name";
        this.recipient = "recipient name";
        this.messageText = "unknown";

    }

    public Message(String sender, String recipient, String messageText)
    {
        setSender(sender);
        setRecipient(recipient);
        setMessageText(messageText);
    }

    public String getSender() {return sender;}
    public void setSender(String sender) {this.sender=sender;}
    public String getRecipient() {return recipient;}
    public void setRecipient(String recipient) {this.recipient=recipient;}
    public String getMessageText() {return messageText;}
    public void setMessageText(String messageText) {this.messageText=messageText;}

    public String toString()
    {
        return "You: " +getSender()+ "\nThem: " +getRecipient()+ "\nYour message:\n" +getMessageText();
    }
}
