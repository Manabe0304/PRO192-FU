public class Bai4 {
    public static void main(String[] args) {
        // Gọi phương thức và in kết quả
        int a = 5; // Biến cục bộ trong phương thức main
        System.out.println("Giá trị của biến a trong main: " + a);

        // Gọi phương thức tinhTong với tham số
        int tong = tinhTong(10, 20);
        System.out.println("Tổng của 10 và 20 là: " + tong);

        // Biến a không thể sử dụng trong phương thức tinhTong, vì nó là biến cục bộ của main
    }

    // Gợi ý: Phương thức tính tổng hai số nguyên
    public static int tinhTong(int x, int y) {
        // Biến x và y là biến cục bộ trong phương thức tinhTong
        return x + y; // Trả về tổng của hai số
    }
}
