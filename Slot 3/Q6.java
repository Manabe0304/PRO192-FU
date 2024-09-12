// Q6: String concatenation and substring operations

public class StringManipulationExample {

    // Phương thức này sẽ thực hiện các thao tác với chuỗi: nối chuỗi và lấy chuỗi con
    public void manipulateStrings() {
        String str1 = "Hello";
        String str2 = "World!";
        // Gợi ý: Khai báo hai chuỗi, ví dụ String str1 = "Hello", str2 = "World!";
        String str3 = str1.concat(str2);
        // Gợi ý: Thực hiện phép nối chuỗi và lưu kết quả vào một chuỗi mới
        // Gợi ý: Sử dụng phương thức substring để lấy một phần của chuỗi
        String substring = str3.substring(0, 5);
        // Gợi ý: Sử dụng System.out.println để in ra kết quả của các thao tác
        System.out.println("Noi choi: " + str3);
        System.out.println("Chuoi con: " + substring);
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp StringManipulationExample
        StringManipulationExample example = new StringManipulationExample();

        // Gọi phương thức manipulateStrings để thực hiện các thao tác với chuỗi
        example.manipulateStrings();
    }
}
