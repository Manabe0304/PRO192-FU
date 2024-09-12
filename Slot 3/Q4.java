// Q4: Declare and initialize variables for different data types

public class VariableInitializationExample {
    
    // Phương thức này sẽ khai báo các biến, gán giá trị cho chúng và in ra màn hình
    public void declareAndPrintVariables() {
        // Gợi ý: Khai báo các biến thuộc kiểu int, double, boolean, và char
        // Gợi ý: Gán giá trị cho các biến đã khai báo
        int a = 20;
        double b = 5.1;
        boolean c = true;
        char d = 'B';
        // Gợi ý: Sử dụng System.out.println để in giá trị của các biến ra màn hình
        System.out.println("So nguyen: " + a);
        System.out.println("So thuc: " + b);
        System.out.println("Boolean: " + c);
        System.out.println("Char: " + d);
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp VariableInitializationExample
        VariableInitializationExample example = new VariableInitializationExample();
        
        // Gọi phương thức declareAndPrintVariables để in ra giá trị các biến đã gán
        example.declareAndPrintVariables();
    }
}

