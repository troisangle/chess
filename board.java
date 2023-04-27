
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Image;
import javax.imageio.ImageIO;


public class board extends Canvas{
private BufferedImage game;


    piece[][] b;



    public board(){
     b = new piece[8][8];
     setBackground(Color.black);
     setVisible(true);
    }




    public boolean isOpen(int x,int y){
        if(b[x][y]==null){
            return true;
        }
        return false;
    }
    public void move(int ox,int oy,int nx,int ny){
        b[nx][ny]= b[ox][oy];
        b[ox][oy] = null;
    }
    public void add(piece z){
        b[z.getX()][z.getY()]=z;
    }
    public void showBoard(){
     
    }
    public void update(Graphics window)
    {
        paint(window);
    }
    public void paint( Graphics window )
	{
        //set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		try
     {
	game = ImageIO.read(getClass().getResourceAsStream("/board.png"));

     }
    catch(Exception e)
          {
	
           }
        
		twoDGraph.setColor(Color.BLACK);
		twoDGraph.drawString("StarFighter ", 25, 50 );
		twoDGraph.setColor(Color.BLACK);
		twoDGraph.fillRect(0,0,2000,1000);
        twoDGraph.drawImage(game, 10,10,800,800, null);
    }
}
