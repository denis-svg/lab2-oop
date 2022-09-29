package lab2;

public class Score {

    private int dot_eaten;

    Score(){
        System.out.println("Initialize score");
        this.dot_eaten = 0;
    }
    public int getScore(){
        return this.dot_eaten * 10;
    }
    public void dotEaten(){
        this.dot_eaten += 1;
    }

}
