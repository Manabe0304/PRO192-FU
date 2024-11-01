//package lab6;
public abstract class Shape implements Rotations, Sound, Comparable{
    private int code;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public void playSound(){
        System.out.println("My code is "+code);
    }
    public void rotate(){
        System.out.println("I'm rotate around the center");
    }
    abstract float perimeter();
    abstract float area();    
}
