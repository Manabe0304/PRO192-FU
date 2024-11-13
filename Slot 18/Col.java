//package lab6;
import java.util.*;

public class Col {
    List<Point> listOfPoints;
    Set<String> setOfPAs;
    Map<String, Point> mapOfCenters;

    Col() {
        listOfPoints = new ArrayList<>();
        setOfPAs = new TreeSet<>();
        mapOfCenters = new TreeMap<>();
    }

    public void setListOfPoints(Object[] a) {
        for (Object obj : a) {
            if (obj instanceof Point) {
                listOfPoints.add((Point) obj);
            }
        }
    }

    public void displayListOfPoints() {
        for (Point p : listOfPoints) {
            System.out.println("(" + p.getX() + ", " + p.getY() + ")");
        }
    }

    public void setSetOfPAs(Point A, Point B) {
        for (int i = 0; i < listOfPoints.size(); i++) {
            Triangle t = new Triangle(A, B, listOfPoints.get(i));
            t.setCode(i);
            setOfPAs.add("(" + t.getCode() + ": perimeter=" + String.format("%.2f", t.perimeter()) + ",area=" + String.format("%.2f", t.area()) + ")");
        }
    }

    public void displaySetOfPAs() {
        for (String pa : setOfPAs) {
            System.out.println(pa);
        }
    }

    public void setMapOfCenters(Point A, Point B) {
        for (int i = 0; i < listOfPoints.size(); i++) {
            Triangle t = new Triangle(A, B, listOfPoints.get(i));
            t.setCode(i);
            mapOfCenters.put("Triangle[" + t.getCode() + "]", t.center());
        }
    }

    public void displayMapOfCenters() {
        for (Map.Entry<String, Point> entry : mapOfCenters.entrySet()) {
            Point p = entry.getValue();
            System.out.println("{" + entry.getKey() + "(" + String.format("%.2f", p.getX()) + ", " + String.format("%.2f", p.getY()) + ")}");
        }
    }
}
