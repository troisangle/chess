public class play{
    player w;
    player b;
    public play(){
        w = new player(true);
        b = new player(false);
        board zyph = new board();
        w.setB(zyph);
        b.setB(zyph);
    }
}
