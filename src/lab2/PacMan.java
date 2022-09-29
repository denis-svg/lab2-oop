package lab2;

public class PacMan {
    final private Point location;
    final public String COLOR = "yellow";
    PacMan(int row, int col){
        System.out.println("PacMan has been initialized");
        this.location = new Point(row, col);
    }
    public Point getLocation(){
        return this.location;
    }
    public void moveUp(){
        System.out.println("PacMan has moved up");
        this.location.setRow(this.location.getRow() - 1);
    }
    public void moveDown(){
        System.out.println("PacMan has moved down");
        this.location.setRow(this.location.getRow() + 1);
    }
    public void moveLeft(){
        System.out.println("PacMan has moved left");
        this.location.setRow(this.location.getCol() - 1);
    }
    public void moveRight(){
        System.out.println("PacMan has moved right");
        this.location.setRow(this.location.getCol() + 1);
    }
    public void draw(){
        System.out.println("Draw pacman");
    }
}
