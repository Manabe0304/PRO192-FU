// Q7: Reading input from the user and formatting the output

import java.util.Scanner;
public class UserInputExample {
    
    // Phương thức này sẽ đọc đầu vào từ người dùng và in ra theo cách đã định dạng
    public void readAndPrintInput() {
        // Gợi ý: Sử dụng Scanner để đọc đầu vào từ người dùng
        Scanner sc = new Scanner(System.in);
        // Gợi ý: Yêu cầu người dùng nhập tên, tuổi, và địa chỉ
        System.out.println("Nhap ten nguoi dung: ");
        String name = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int dob = sc.nextInt();
	System.out.printf("Ten: %s\n", name);
        System.out.printf("Dia chi: %s\n", address);
	System.out.printf("Tuoi: %d\n", dob);
        // Gợi ý: Sử dụng System.out.printf để in ra dữ liệu theo định dạng
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp UserInputExample
        UserInputExample example = new UserInputExample();
        
        // Gọi phương thức readAndPrintInput để đọc đầu vào và in ra kết quả
        example.readAndPrintInput();
    }
}
