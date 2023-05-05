
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
private BufferedImage rook;
private BufferedImage pawn;
private BufferedImage knight;
private BufferedImage bishop;
private BufferedImage queen;
private BufferedImage king;


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
    pawn = ImageIO.read(getClass().getResourceAsStream("/pawn.png"));
    rook = ImageIO.read(getClass().getResourceAsStream("/rook.png"));
    knight = ImageIO.read(getClass().getResourceAsStream("/knight.png"));
    bishop = ImageIO.read(getClass().getResourceAsStream("/bishop.png"));
    queen = ImageIO.read(getClass().getResourceAsStream("/queen.png"));
    king = ImageIO.read(getClass().getResourceAsStream("/king.png"));

     }
    catch(Exception e)
          {
	
           }
        
		twoDGraph.setColor(Color.WHITE);

		twoDGraph.fillRect(0,0,2000,1000);
     
        twoDGraph.drawImage(game, 10,10,800,800, null);
        int x = 50;
        int y = 50;
        for(piece[] a: b){
            for(piece z :a){
                if(z!= null&&z.getPiece().equals("r")){
                twoDGraph.drawImage(rook, x,y,75,75, null);
                }
                if(z!= null&&z.getPiece().equals("p")){
                    twoDGraph.drawImage(pawn, x,y,75,75, null);
                    }

                if(z!= null&&z.getPiece().equals("b")){
                        twoDGraph.drawImage(bishop, x,y,75,75, null);
                        }

                        if(z!= null&&z.getPiece().equals("q")){
                            twoDGraph.drawImage(queen, x,y,75,75, null);
                            }
                            if(z!= null&&z.getPiece().equals("k")){
                                twoDGraph.drawImage(king, x,y,75,75, null);
                                }
                                if(z!= null&&z.getPiece().equals("kn")){
                                    twoDGraph.drawImage(knight, x,y,75,75, null);
                                    }
                x+=91;
            }
            y+=91;
            x=50;
        }
       
    }
}
