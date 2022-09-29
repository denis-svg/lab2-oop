package lab2;

public class Blinky {
    final private Point location;
    final public String COLOR = "red";
    Blinky(int row, int col){
        System.out.println("Blinky has been initialized");
        this.location = new Point(row, col);
    }
    public Point getLocation(){
        return this.location;
    }
    private void moveUp(){
        System.out.println("Blinky has moved up");
        this.location.setRow(this.location.getRow() - 1);
    }
    private void moveDown(){
        System.out.println("Blinky has moved down");
        this.location.setRow(this.location.getRow() + 1);
    }
    private void moveLeft(){
        System.out.println("Blinky has moved left");
        this.location.setRow(this.location.getCol() - 1);
    }
    private void moveRight(){
        System.out.println("Blinky has moved right");
        this.location.setRow(this.location.getCol() + 1);
    }

    public void chaseAggresive(){
        System.out.println("Chassing PacMan agressively");
    }
    public void draw(){
        System.out.println("Draw blinky");
    }
}
