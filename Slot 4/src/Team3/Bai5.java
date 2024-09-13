package Team3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Bai5 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Chao mung");
        
        sb.append(" Java");
        
        sb.insert(9, " den voi lap trinh");
        
        System.out.println("Chuoi sau khi noi va chen: " + sb.toString());
        
        sb.reverse();
        System.out.println("Chuoi sau khi dao nguoc: " + sb.toString());
    }
}
