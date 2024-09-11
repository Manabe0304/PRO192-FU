// Q2: A Simple Java Program with Comments

public class HelloWorldWithComments {
    
    // Phương thức này sẽ in ra dòng chữ "Hello, World!" trên màn hình
    public void printMessage() {
        // Gợi ý: Thêm một chú thích (comment) giải thích mục đích của câu lệnh in ra màn hình
        // Gợi ý: Sử dụng System.out.println để in "Hello, World!" ra màn hình
        // Câu lệnh dưới đây in ra dòng chữ "Hello, World!" trên màn hình
        System.out.println("Hello, World!");
    }
    
    // Đây là phương thức main - điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // Tạo một đối tượng thuộc lớp HelloWorldWithComments
        // Đối tượng này sẽ được sử dụng để gọi phương thức printMessage
        HelloWorldWithComments hello = new HelloWorldWithComments();
        
        // Gọi phương thức printMessage để in ra thông điệp "Hello, World!"
        // Phương thức này sẽ thực hiện in dòng chữ khi được gọi
        hello.printMessage();

        // Đây là phần kết thúc của phương thức main
        // Mọi thao tác đã được thực hiện và chương trình kết thúc
        // Gợi ý: Thêm chú thích giải thích từng dòng code ở trên.
    }
}
