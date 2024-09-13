import java.math.BigInteger;
import java.math.BigDecimal;

public class Bai2 {
    public static void main(String[] args) {
        // Gợi ý: Sử dụng BigInteger cho các phép toán với số nguyên lớn
        BigInteger soNguyenLon1 = new BigInteger("12345678901234567890");
        BigInteger soNguyenLon2 = new BigInteger("98765432109876543210");
        BigInteger tong = soNguyenLon1.add(soNguyenLon2); // Cộng hai số nguyên lớn

        // Sử dụng BigDecimal cho các phép toán với số thập phân lớn
        BigDecimal soThapPhanLon1 = new BigDecimal("12345.6789");
        BigDecimal soThapPhanLon2 = new BigDecimal("98765.4321");
        BigDecimal tich = soThapPhanLon1.multiply(soThapPhanLon2); // Nhân hai số thập phân lớn

        // In kết quả ra màn hình
        System.out.println("Tổng của hai số nguyên lớn: " + tong);
        System.out.println("Tích của hai số thập phân lớn: " + tich);
    }
}
