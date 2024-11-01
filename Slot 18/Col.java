//package lab6;
import java.util.*;
public class Col {
    List<Point> listOfPoints;
    Set<String> setOfPAs;
    Map<String, Point> mapOfCenters;
    Col(){
        //insert code
        listOfPoints = new ArrayList<>();
        setOfPAs = new TreeSet<>();
        mapOfCenters = new TreeMap<>();
    }
    public void setListOfPoints(Object a[]){
        //insert code
        for (Object obj : a) {
            if (obj instanceof Point) {
                listOfPoints.add((Point) obj);
            }
        }
    }
    public void displayListOfPoints(){
        System.out.print(listOfPoints);
    }
    public void setSetOfPAs(Point A, Point B){
        //insert code
        for (int i = 0; i < 10; i++) {
            Point C = new Point(i * 0.1f, i * 0.1f); // Adjust C for each triangle
            Triangle t = new Triangle(A, B, C);
            String triangleInfo = "(" + t.getCode() + ": perimeter=" + t.perimeter() + ", area=" + t.area() + ")";
            setOfPAs.add(triangleInfo);
        }
    }
    public void displaySetOfPAs(){
        //insert code
        for (String triangleInfo : setOfPAs) {
            System.out.println(triangleInfo);
        }
    }
    public void setMapOfCenters(Point A, Point B){
        //insert code
        for (int i = 0; i < 10; i++) {
            Point C = new Point(i * 0.1f, i * 0.1f); // Vary C for each triangle
            Triangle t = new Triangle(A, B, C);
            String triangleKey = "Triangle[" + t.getCode() + "]";
            mapOfCenters.put(triangleKey, t.center());
        }
    }
    public void displayMapOfCenters(){
        for (Map.Entry<String, Point> entry : mapOfCenters.entrySet()) {
            System.out.println("Triangle Code: " + entry.getKey() + ", Center: " + entry.getValue());
        }
    }
}
