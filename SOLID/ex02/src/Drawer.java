public class Drawer implements IDrawer {
    public void draw(Frame frame) {
        System.out.println("Drawing frame with " + frame.getData().length + " bytes");
    }
}
