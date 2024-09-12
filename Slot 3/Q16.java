public class CommandLineExample {

    // Phương thức để in các tham số dòng lệnh
    public void inThamSoDongLenh(String[] args) {
        // Gợi ý: Sử dụng vòng lặp for-each để duyệt qua các tham số
        // Ví dụ: for (String arg : args) { ... }
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp CommandLineExample
        CommandLineExample commandLineExample = new CommandLineExample();

        // Gọi phương thức in tham số dòng lệnh
        commandLineExample.inThamSoDongLenh(args);
    }
}
