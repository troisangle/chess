public abstract class piece {
    private int x;
    private int y;
    public piece( int x, int y){
    this.x=x;
    this.y=y;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public String yCord(int x){
        if(x==1){
            return "a";
        }
        if(x==2){
            return "b";
        }
        if(x==3){
            return "c";
        }
        if(x==4){
            return "d";
        }
        if(x==5){
            return "e";
        }
        if(x==6){
            return "f";
        }
        if(x==7){
            return "g";
        }
        if(x==8){
            return "h";
        }
      return "error" ;
    }
    public String getPiece(){
     return "x";
    };

    
}
