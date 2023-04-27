import java.util.ArrayList;
public class player {
    ArrayList<piece> pieces;
    public player(boolean isWhite){
        if(isWhite){
        pieces = new ArrayList<>();
        for(int i = 0;i<=7;i++){
            pieces.add(new pawn(i, 2));
        }
        for(int i = 0;i<=7;i+=7){
            pieces.add(new rook(i, 1));
        }
        for(int i = 1;i<8;i+=5){
            pieces.add(new knight(i, 1));
        }
        for(int i = 2;i<6;i+=3){
            pieces.add(new bishop(i, 1));
        }
            pieces.add(new king(5, 1));
            pieces.add(new queen(4, 1));
    }else{
        pieces = new ArrayList<>();
        for(int i = 0;i<=7;i++){
            pieces.add(new pawn(i, 6));
        }
        for(int i = 0;i<=7;i+=7){
            pieces.add(new rook(i, 7));
        }
        for(int i = 1;i<8;i+=5){
            pieces.add(new knight(i, 7));
        }
        for(int i = 2;i<6;i+=3){
            pieces.add(new bishop(i, 7));
        }
            pieces.add(new king(5, 7));
            pieces.add(new queen(4, 7));  
    }
    }
    public void setB(board b){
    for(piece x: pieces){
        b.add(x);
    }
    }
}
