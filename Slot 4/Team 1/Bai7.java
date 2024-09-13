public class Bai7 {
    // Gợi ý: Khai báo các thuộc tính với phạm vi truy cập khác nhau
    public String publicAttribute = "Public";
    private String privateAttribute = "Private";
    protected String protectedAttribute = "Protected";
    String defaultAttribute = "Default"; // Không có phạm vi truy cập

    // Phương thức để in giá trị các thuộc tính trong cùng lớp
    public void hienThiPhamViTruyCap() {
        System.out.println("Public: " + publicAttribute);
        System.out.println("Private: " + privateAttribute);
        System.out.println("Protected: " + protectedAttribute);
        System.out.println("Default: " + defaultAttribute);
    }

    public static void main(String[] args) {
        Bai7 obj = new Bai7();
        obj.hienThiPhamViTruyCap();

        // Kiểm tra truy cập từ bên ngoài
        System.out.println("Truy cập từ lớp ngoài:");
        System.out.println("Public: " + obj.publicAttribute);
        // System.out.println("Private: " + obj.privateAttribute); // Lỗi vì thuộc tính private
        System.out.println("Protected: " + obj.protectedAttribute);
        System.out.println("Default: " + obj.defaultAttribute);
    }
}
