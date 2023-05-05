import java.util.ArrayList;
public class player {
    ArrayList<piece> pieces;
    public player(boolean isWhite){
        if(isWhite){
        pieces = new ArrayList<>();
        for(int i = 0;i<=7;i++){
            pieces.add(new pawn( 1,i));
        }
        for(int i = 0;i<=7;i+=7){
            pieces.add(new rook( 0,i));
        }
        for(int i = 1;i<8;i+=5){
            pieces.add(new knight( 0,i));
        }
        for(int i = 2;i<6;i+=3){
            pieces.add(new bishop( 0,i));
        }
            pieces.add(new king( 0,4));
            pieces.add(new queen( 0,3));
    }else{
        pieces = new ArrayList<>();
        for(int i = 0;i<=7;i++){
            pieces.add(new pawn( 6,i));
        }
        for(int i = 0;i<=7;i+=7){
            pieces.add(new rook( 7,i));
        }
        for(int i = 1;i<8;i+=5){
            pieces.add(new knight( 7,i));
        }
        for(int i = 2;i<6;i+=3){
            pieces.add(new bishop( 7,i));
        }
            pieces.add(new king( 7,4));
            pieces.add(new queen( 7,3));  
    }
    }
    public void setB(board b){
    for(piece x: pieces){
        b.add(x);
    }
    }
}
