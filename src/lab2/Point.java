package lab2;

public class Point {
    private int row;
    private int col;
    Point(int row, int col){
        this.row = row;
        this.col = col;
    }
    public void setRow(int row){
        this.row = row;
    }
    public int getRow(){
        return this.row;
    }
    public void setCol(int col){
        this.col = col;
    }
    public int getCol(){
        return this.col;
    }
}
