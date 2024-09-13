package Team3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.math.BigInteger;
import java.math.BigDecimal;

public class Bai2 {
    public static void main(String[] args) {
        BigInteger soNguyenLon1 = new BigInteger("34793759365926529");
        BigInteger soNguyenLon2 = new BigInteger("79177581107596283");
        BigInteger tong = soNguyenLon1.add(soNguyenLon2);
        
        BigDecimal soThapPhanLon1 = new BigDecimal("537863.2816");
        BigDecimal soThapPhanLon2 = new BigDecimal("416968.1829");
        BigDecimal tich = soThapPhanLon1.multiply(soThapPhanLon2);
        
        System.out.println("Tong cua hai so nguyen lon = "  + tong);
        System.out.println("Tich cua hao so thap phan lon = " + tich);
    }
    
}
