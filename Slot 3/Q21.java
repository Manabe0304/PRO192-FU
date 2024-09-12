import java.util.Scanner;

public class SimpleCalculator {

    // Phương thức để thực hiện các phép tính cơ bản
    public double thucHienPhepTinh(double a, double b, char operator) {
        // Gợi ý: Sử dụng cấu trúc điều kiện (switch hoặc if-else) để xử lý các toán tử +, -, *, /
        // Ví dụ: if (operator == '+') { return a + b; } else if ...
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Loi: Khong the chia cho 0.");
                    return Double.NaN; // Trả về NaN để biểu thị lỗi
                }
            default:
                System.out.println("Loi: Toan tu khong hop le.");
                return Double.NaN; // Trả về NaN để biểu thị lỗi
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp SimpleCalculator
        SimpleCalculator calculator = new SimpleCalculator();

        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ người dùng
        System.out.println("Nhap so thu nhat:");
        double num1 = scanner.nextDouble();

        System.out.println("Nhap so thu hai:");
        double num2 = scanner.nextDouble();

        // Nhập toán tử từ người dùng
        System.out.println("Nhap toan tu (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // Gọi phương thức để thực hiện phép tính
        double ketQua = calculator.thucHienPhepTinh(num1, num2, operator);

        // Hiển thị kết quả
        System.out.println("Ket qua: " + ketQua);
    }
}
