package lab2;

public class Dot {
    private String color;
    private boolean is_eaten;
    Dot(int row, int col){
        Point location = new Point(row, col);
        is_eaten = false;
        color = "green";
    }
    public void hasBeenEaten(){
        color = "white";
        is_eaten = true;
    }
    public boolean isEaten(){
        return is_eaten;
    }
    public void draw(){
        System.out.println("Draw dot");
    }
}
