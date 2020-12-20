
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public void setX(int newX){
        this.x = newX;
    }

    public void printPoint(){
        System.out.println("Point: x:" +
                this.x + " y:" + this.y);
    }

}
