// Q9: Using a for loop to print numbers from 1 to 10

public class LoopExample {
    
    // Phương thức này sẽ sử dụng vòng lặp for để in ra các số từ 1 đến 10
    public void printNumbers() {
        // Gợi ý: Sử dụng vòng lặp for, bắt đầu từ 1 và lặp đến 10
        // Gợi ý: Sử dụng System.out.println để in ra từng số
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
    
    // Phương thức main() đã hoàn thành sẵn
    public static void main(String[] args) {
        // Tạo đối tượng của lớp LoopExample
        LoopExample example = new LoopExample();
        
        // Gọi phương thức printNumbers để in ra các số từ 1 đến 10
        example.printNumbers();
    }
}
