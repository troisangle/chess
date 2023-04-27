
import javax.swing.JFrame;
import java.awt.Component;
public class play extends JFrame{
    player w;
    player b;
    public play(){
        super("Chess");
        w = new player(true);
        b = new player(false);
        board theGame = new board();
        w.setB(theGame);
        b.setB(theGame);

       
		setSize(500,500);

        ((Component) theGame).setFocusable(true);
   
        getContentPane().add(theGame);
   
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public static void main(String [] args){
        play game = new play();
    }
}
