import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Gợi ý: Sử dụng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        // Hiển thị kết quả ra màn hình
        System.out.println("Xin chào, " + ten);
    }
}
