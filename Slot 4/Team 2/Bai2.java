import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Gợi ý: Nhập một số nguyên từ người dùng và sử dụng if-else để kiểm tra điều kiện
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên
        System.out.print("Nhập một số nguyên: ");
        int so = scanner.nextInt();

        // Kiểm tra xem số đã nhập là chẵn hay lẻ
        if (so % 2 == 0) {
            System.out.println(so + " là số chẵn");
        } else {
            System.out.println(so + " là số lẻ");
        }
    }
}
