package lab2;

public class Maze {
    private Wall[] walls;
    private Dot[] dots;
    Maze(){
        dots = new Dot[]{new Dot(0, 0), new Dot(1, 0)};
        walls = new Wall[]{new Wall(0, 0), new Wall(1, 0)};
    }
    public void resetMaze(){
        System.out.println("reseting maze");
        Dot[] dots = {new Dot(0, 0), new Dot(1, 0)};
        Wall[] walls = {new Wall(0, 0), new Wall(1, 0)};
    }
    public boolean isValidMove(Point move){
        return !this.isWall(move);
    }
    public boolean isDot(Point move){
        // dot will be assigned is eaten value true;
        return false;
    }
    private boolean isWall(Point move){
        return true;
    }
    public void draw(){
        // draw walls
        for(int i = 0;i<2;i++){
            walls[i].draw();
        }
        // draw dots
        for(int i = 0;i<2;i++){
            dots[i].draw();
        }
    }
}
