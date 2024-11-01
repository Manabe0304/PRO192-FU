
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duong
 */
import java.util.List;  
import java.util.Collections;  
import java.util.Comparator;  
public class MyCar implements ICar {  

    // Phương thức f1: Tính phần nguyên của tỷ lệ trung bình  
    @Override  
    public int f1(List<Car> t) {  
        if (t.isEmpty()) return 0;  

        double totalRate = 0;  
        for (Car car : t) {  
            totalRate += car.getRate();  
        }  
        return (int) (totalRate / t.size());  
    }  

    // Phương thức f2: Tìm tỷ lệ lớn nhất và nhỏ nhất và hoán đổi vị trí  
    @Override  
    public void f2(List<Car> t) {  
        if (t.size() < 2) return;  

        int maxIndex = 0;  
        int minIndex = 0;  

        for (int i = 1; i < t.size(); i++) {  
            if (t.get(i).getRate() > t.get(maxIndex).getRate()) {  
                maxIndex = i;  
            }  
            if (t.get(i).getRate() < t.get(minIndex).getRate()) {  
                minIndex = i;  
            }  
        }  

        // Hoán đổi  
        Collections.swap(t, maxIndex, minIndex);  
    }  

    // Phương thức f3: Sắp xếp danh sách theo tên nhà sản xuất  
    @Override  
    public void f3(List<Car> t) {  
        Collections.sort(t, new Comparator<Car>() {  
            @Override  
            public int compare(Car c1, Car c2) {  
                int makerComparison = c1.getMaker().compareTo(c2.getMaker());  
                if (makerComparison == 0) {  
                    return Integer.compare(c2.getRate(), c1.getRate()); // Sắp xếp giảm dần theo tỷ lệ  
                }  
                return makerComparison;  
            }  
        });  
    }  
}
