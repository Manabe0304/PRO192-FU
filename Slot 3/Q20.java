public class FactorialExample {

    // Phương thức để tính giai thừa bằng đệ quy
    public int tinhGiaiThua(int n) {
        // Gợi ý: Sử dụng điều kiện cơ bản (n == 0) trả về 1, và gọi đệ quy với n - 1
        if (n == 0) {
            return 1;
        }
        // Ví dụ: return n * tinhGiaiThua(n - 1);
        return n * tinhGiaiThua(n - 1); // Thay bằng câu lệnh đệ quy để tính giai thừa
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp FactorialExample
        FactorialExample factorialExample = new FactorialExample();

        // Giá trị đầu vào
        int n = 5;

        // Tính giai thừa của n và hiển thị kết quả
        int ketQua = factorialExample.tinhGiaiThua(n);
        System.out.println("Giai thua cua " + n + " la: " + ketQua);
    }
}
