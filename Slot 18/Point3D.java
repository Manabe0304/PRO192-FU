//package lab6;
public class Point3D extends Point{
    private int z;

    public Point3D() {
    }

    public Point3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public float distanceTo(Point3D A){
        double d=Math.sqrt((super.getX()-A.getX())*(super.getX()-A.getX())+(super.getY()-A.getY())*(super.getY()-A.getY())+(z-A.getZ())*(z-A.getZ()));
        return (float)d;
    }
    

    @Override
    public String toString() {
        return "("+ getX() + ", " + getY() + ','+z+")";
    }
    
}
