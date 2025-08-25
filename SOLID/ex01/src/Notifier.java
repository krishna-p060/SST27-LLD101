public interface Notifier {
    void send(String to, String body);
    String getId();
}
