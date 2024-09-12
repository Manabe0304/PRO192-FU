import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {

    // Phương thức để cộng hai số kiểu BigInteger
    public BigInteger congBigInteger(BigInteger a, BigInteger b) {
        // Gợi ý: Sử dụng phương thức add() của BigInteger để cộng hai số
        return a.add(b); // Thay bằng câu lệnh thực hiện phép cộng
    }

    // Phương thức để nhân hai số kiểu BigInteger
    public BigInteger nhanBigInteger(BigInteger a, BigInteger b) {
        // Gợi ý: Sử dụng phương thức multiply() của BigInteger để nhân hai số
        return a.multiply(b); // Thay bằng câu lệnh thực hiện phép nhân
    }

    // Phương thức để chia hai số kiểu BigDecimal
    public BigDecimal chiaBigDecimal(BigDecimal a, BigDecimal b) {
        // Gợi ý: Sử dụng phương thức divide() của BigDecimal và chú ý đến tỷ lệ chia (scale)
        return a.divide(b); // Thay bằng câu lệnh thực hiện phép chia
    }

    public static void main(String[] args) {
        // Tạo một đối tượng của lớp BigNumbers
        BigNumbers bigNumbers = new BigNumbers();

        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập và xử lý các số BigInteger
        System.out.println("Nhap so nguyen lon thu nhat (BigInteger):");
        BigInteger bigInt1 = new BigInteger(scanner.nextLine());

        System.out.println("Nhap so nguyen lon thứ hai (BigInteger):");
        BigInteger bigInt2 = new BigInteger(scanner.nextLine());

        // Nhập và xử lý các số BigDecimal
        System.out.println("Nhap so thuc lon thu nhat (BigDecimal):");
        BigDecimal bigDec1 = new BigDecimal(scanner.nextLine());

        System.out.println("Nhap so thuc lon thu hai (BigDecimal):");
        BigDecimal bigDec2 = new BigDecimal(scanner.nextLine());

        // Sử dụng các phương thức đã định nghĩa
        BigInteger tong = bigNumbers.congBigInteger(bigInt1, bigInt2);
        BigInteger tich = bigNumbers.nhanBigInteger(bigInt1, bigInt2);
        BigDecimal thuong = bigNumbers.chiaBigDecimal(bigDec1, bigDec2);

        // Hiển thị kết quả
        System.out.println("Tong cua hai so nguyen lon: " + tong);
        System.out.println("Tich cua hai so nguyen lon: " + tich);
        System.out.println("Thuong cua hai so thuc lon: " + thuong);
    }
}
