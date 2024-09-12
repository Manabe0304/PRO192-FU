// Q5: Perform mathematical operations using different operators

public class MathOperationsExample {
    
    // Phương thức này sẽ thực hiện các phép toán cơ bản và in ra kết quả
    public void performOperations() {
        // Gợi ý: Khai báo hai biến số, ví dụ int a = 10, b = 5;
        int a = 10, b = 5;
        int cong = a + b;
        int tru = a - b;
        int nhan = a * b;
        int chia = a / b;
        int chiaDu = a % b;
        // Gợi ý: Thực hiện các phép toán: cộng, trừ, nhân, chia
        // Gợi ý: Sử dụng System.out.println để in ra kết quả của từng phép toán
        System.out.println("Cong: " + cong);        // Kết quả của phép cộng
        System.out.println("Tru: " + tru);          // Kết quả của phép trừ
        System.out.println("Nhan: " + nhan);        // Kết quả của phép nhân
        System.out.println("Chia: " + chia);        // Kết quả của phép chia
        System.out.println("Chia du: " + chiaDu);
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp MathOperationsExample
        MathOperationsExample example = new MathOperationsExample();
        
        // Gọi phương thức performOperations để thực hiện và in ra kết quả các phép toán
        example.performOperations();
    }
}
