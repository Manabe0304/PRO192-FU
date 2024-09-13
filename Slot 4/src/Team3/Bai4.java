package Team3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Bai4 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("Gia tri cua bien a trong main: " + a);
        
        int tong = tinhTong(20, 30);
        System.out.println("Tong cua 20 va 30 la: " + tong);
    }
    
    public static int tinhTong(int x, int y) {
        return x + y;
    }
}
