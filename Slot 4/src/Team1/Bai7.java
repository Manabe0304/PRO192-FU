package Team1;
/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Bai7 {
    public String publicAttribute = "Public";
    private String privateAttribute = "Private";
    protected String protectedAttribute = "Protected";
    String defaultAttribute = "Default"; 

    public void hienThiPhamViTruyCap() {
        System.out.println("Public: " + publicAttribute);
        System.out.println("Private: " + privateAttribute);
        System.out.println("Protected: " + protectedAttribute);
        System.out.println("Default: " + defaultAttribute);
    }

    public static void main(String[] args) {
        Bai7 obj = new Bai7();
        obj.hienThiPhamViTruyCap();

        System.out.println("Truy cap tu ben ngoai:");
        System.out.println("Public: " + obj.publicAttribute);
        // System.out.println("Private: " + obj.privateAttribute); // Lỗi vì thuộc tính private
        System.out.println("Protected: " + obj.protectedAttribute);
        System.out.println("Default: " + obj.defaultAttribute);
    }
}
