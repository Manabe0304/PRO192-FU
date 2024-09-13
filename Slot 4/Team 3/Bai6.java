import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bai6 {
    public static void main(String[] args) {
        // Gợi ý: Đọc dữ liệu từ tệp văn bản
        try (FileReader fr = new FileReader("input.txt")) {
            int i;
            StringBuilder content = new StringBuilder();
            
            // Đọc từng ký tự từ tệp và nối vào chuỗi
            while ((i = fr.read()) != -1) {
                content.append((char) i);
            }
            
            System.out.println("Nội dung đọc từ tệp: " + content.toString());
            
            // Ghi dữ liệu vào tệp mới
            try (FileWriter fw = new FileWriter("output.txt")) {
                fw.write(content.toString());
                System.out.println("Nội dung đã được ghi vào tệp output.txt");
            }

        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi đọc hoặc ghi tệp: " + e.getMessage());
        }
    }
}
