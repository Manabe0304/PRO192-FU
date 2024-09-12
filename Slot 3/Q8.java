// Q8: Using if-else statements to control program flow based on user input
import java.util.Scanner;
public class ControlFlowExample {
    
    // Phương thức này sẽ kiểm tra đầu vào từ người dùng và quyết định luồng chương trình dựa trên các câu lệnh if-else
    public void checkInput() {
        // Gợi ý: Sử dụng Scanner để đọc một số nguyên từ người dùng
        // Gợi ý: Sử dụng if-else để kiểm tra giá trị của số đó (ví dụ: kiểm tra xem số đó có lớn hơn hay nhỏ hơn 10)
        // Gợi ý: In ra thông báo tương ứng dựa trên giá trị của số đã nhập
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println(n + " lon hon 10");
        } else {
            System.out.println(n + " nho hon 10");
        }
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp ControlFlowExample
        ControlFlowExample example = new ControlFlowExample();
        
        // Gọi phương thức checkInput để kiểm tra đầu vào và thực hiện điều kiện
        example.checkInput();
    }
}
