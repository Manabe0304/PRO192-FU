// Q3: Declare different data types and print them

public class DataTypeExample {
    
    // Phương thức này sẽ khai báo và in ra các kiểu dữ liệu khác nhau
    public void printDataTypes() {
        // Gợi ý: Khai báo các biến thuộc kiểu int, double, boolean, char
        int a = 10;
        double b = 4.5;
        boolean c = true;
        char d = 'A';
        // Gợi ý: Sử dụng System.out.println để in giá trị của các biến ra màn hình
        System.out.println("So nguyen: " + a);
        System.out.println("So thuc: " + b);
        System.out.println("Boolean: " + c);
        System.out.println("Char: " + d);
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp DataTypeExample
        DataTypeExample example = new DataTypeExample();
        
        // Gọi phương thức printDataTypes để in ra các kiểu dữ liệu
        example.printDataTypes();
    }
}
