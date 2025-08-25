public class Cacher implements ICacher {
    private Frame last;

    public void cache(Frame frame) {
        last = frame;
        System.out.println("Cached last frame" + (last != null ? " with " + last.getData().length + " bytes" : ""));
    }

    public Frame getLast() {
        return last;
    }
}
