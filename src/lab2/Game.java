package lab2;

public class Game {
    private Maze maze;
    private PacMan pacman;
    private Clyde clyde;
    private Blinky blinky;
    private Score score;
    Game(){
        maze = new Maze();
        pacman = new PacMan(0, 0);
        clyde = new Clyde(1 , 1);
        blinky = new Blinky(1 , 10);
        score = new Score();
    }
    public void run(){
        // main loop
        boolean done=false;
        while(!done){
            int event = getEvent();
            this.draw();
            if (checkLose() || checkWin()){
                done = true;
            }
        }
    }
    private void draw(){
        maze.draw();
        pacman.draw();
        clyde.draw();
        blinky.draw();
    }
    private int getEvent(){
        return 1;
    }
    private boolean checkLose(){
        return true;
    }
    private boolean checkWin(){
        return false;
    }
}
