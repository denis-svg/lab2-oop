package lab2;

public class Wall {
    static String COLOR = "black";
    Wall(int row, int col){
        Point location = new Point(row, col);
    }

    public void draw() {
        System.out.println("draw wall");
    }
}
