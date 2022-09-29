package lab2;

public class Clyde {
    final private Point location;
    final public String COLOR = "orange";
    Clyde(int row, int col){
        System.out.println("Clyde has been initialized");
        this.location = new Point(row, col);
    }
    public Point getLocation(){
        return this.location;
    }
    private void moveUp(){
        System.out.println("Clyde has moved up");
        this.location.setRow(this.location.getRow() - 1);
    }
    private void moveDown(){
        System.out.println("Clyde has moved down");
        this.location.setRow(this.location.getRow() + 1);
    }
    private void moveLeft(){
        System.out.println("Clyde has moved left");
        this.location.setRow(this.location.getCol() - 1);
    }
    private void moveRight(){
        System.out.println("Clyde has moved right");
        this.location.setRow(this.location.getCol() + 1);
    }

    public void chaseRandom(){
        System.out.println(" Clyde Moving randomly");
    }
    public void draw(){
        System.out.println("Draw clyde");
    }
}
