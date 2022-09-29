package lab2;

public class Lava {
    private String color;
    private boolean is_active;
    Lava(int row, int col){
        Point location = new Point(row, col);
        this.is_active = false;
        color = "white";
    }

    public void draw() {
        System.out.println("draw lava");
    }
    public void activateLava(){
    	is_active = true;
    	color = "red";
    }
    public void deactivateLava(){
    	is_active = false;
    	color = "white";
    }
    
}
