public class Demo02 {
    public static void main(String[] args) {
        IDecoder decoder = new Decoder();
        IDrawer drawer = new Drawer();
        ICacher cacher = new Cacher();
        Player player = new Player(decoder, drawer, cacher);
        player.play(new byte[]{1,2,3,4});
    }
}
