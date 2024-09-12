public class StringArrayExample {

    // Phương thức để in mảng các chuỗi
    public void inMangChuoi(String[] arr) {
        // Gợi ý: Sử dụng vòng lặp for-each để duyệt qua từng phần tử của mảng
        // Ví dụ: for (String chuoi : arr) { ... }
        for (String mang : arr) {
            System.out.print(mang + " ");
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp StringArrayExample
        StringArrayExample stringArrayExample = new StringArrayExample();

        // Tạo mảng các chuỗi sử dụng bộ khởi tạo mảng
        String[] arr = {"Xin chao", "Java", "Mang", "Chuoi"};

        // Gọi phương thức in mảng chuỗi
        stringArrayExample.inMangChuoi(arr);
    }
}
