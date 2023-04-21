public class board{
    piece[][] b;
    public board(){
     b = new piece[8][8];
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
}
