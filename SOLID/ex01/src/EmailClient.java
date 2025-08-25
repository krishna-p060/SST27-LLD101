public class EmailClient implements Notifier {
    String email;
    public EmailClient(String email) {
        this.email = email;
    }
    public void send(String to, String body) {
        System.out.println("[EMAIL from=" + this.email + " to=" + to + "] " + body);
    }
    public String getId() {
        return this.email;
    }
}