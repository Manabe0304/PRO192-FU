//package lab6;
import java.lang.Math;
public class Point {
    private float x,y;
    public Point() {
    }

    public Point(float px, float py) {
        //insert code
        this.x = px;
        this.y = py;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        //insert code
        this.x = x;
    }

    public void setY(float y) {
        //insert code
        this.y = y;
    }
    public float distanceTo(Point A){
        double d=0;
        //insert code
        d = Math.sqrt(Math.pow(this.x - A.getX(), 2) + Math.pow(this.y - A.getY(), 2));
        return (float)d;
    }

    @Override
    public String toString() {
        return "("+ x + ", " + y + ')';
    }
    
}
