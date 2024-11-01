//package lab6;
import java.lang.Math;
public class Triangle extends Shape{
    Point A,B,C;
    public Triangle(Point A, Point B, Point C) {
        //insert code
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public float perimeter(){
        float peri=0;
        //insert code
        peri = A.distanceTo(B) + B.distanceTo(C) + C.distanceTo(A);
        return peri;
    }
    public float area(){
        float ar=0;
        //insert code
        float s = perimeter() / 2;
        ar = (float) Math.sqrt(s * (s - A.distanceTo(B)) * (s - B.distanceTo(C)) * (s - C.distanceTo(A)));
        return ar;
    }
    public void playSound(){
        System.out.println("I am a triangle, my name is "+super.getCode());
    }
    public void rotate(){
        Point p=center();
        System.out.println("I'm rotate around the center: "+p.toString());
    }

    public Point center(){
        float xp=0;
        float yp=0;
        //insert code
        Point p=new Point(xp,yp);
        xp = (A.getX() + B.getX() + C.getX()) / 3;
        yp = (A.getY() + B.getY() + C.getY()) / 3;
        return p;
    }
    public int compareTo(Object o){
        Triangle st = (Triangle)o;
        int no=getCode();
        if(no>st.getCode())
             return 1;
         else if(no == st.getCode())
             return 0;
         else
             return -1;
     }      

}
