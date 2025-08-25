public class Player {

    private IDecoder decoder;
    private IDrawer drawer;
    private ICacher cacher;

    public Player(IDecoder decoder, IDrawer drawer, ICacher cacher) {
        this.decoder = decoder;
        this.drawer = drawer;
        this.cacher = cacher;
    }

    public void play(byte[] fileBytes){
        Frame frame = decoder.decode(fileBytes);
        drawer.draw(frame);
        cacher.cache(frame);
    }
}