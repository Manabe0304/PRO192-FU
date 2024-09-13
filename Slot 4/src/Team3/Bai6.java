package Team3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bai6 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt")) {
            int i;
            StringBuilder content = new StringBuilder();
            
            while ((i = fr.read()) != -1) {
                content.append((char) i);
            }
            
            System.out.println("Noi dung doc tu tep: " + content.toString());
            
            try (FileWriter fw = new FileWriter("output.txt")) {
                fw.write(content.toString());
                System.out.println("Noi dung da duoc ghi vao tep output.txt");
            }
            
        } catch (IOException e) {
            System.out.println("Co loi xay ra khi doc hoac ghi tep: " + e);
        }
    }
}
