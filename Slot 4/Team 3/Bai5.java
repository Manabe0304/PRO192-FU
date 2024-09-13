public class Bai5 {
    public static void main(String[] args) {
        // Gợi ý: Tạo đối tượng StringBuilder và thực hiện các thao tác với chuỗi
        StringBuilder sb = new StringBuilder("Xin chào");

        // Thêm chuỗi " Java" vào chuỗi ban đầu
        sb.append(" Java");

        // Chèn chuỗi " lập trình" vào vị trí 8
        sb.insert(8, " lập trình");

        // In chuỗi sau khi đã thao tác
        System.out.println("Chuỗi sau khi nối và chèn: " + sb.toString());

        // Đảo ngược chuỗi
        sb.reverse();
        System.out.println("Chuỗi sau khi đảo ngược: " + sb.toString());
    }
}
