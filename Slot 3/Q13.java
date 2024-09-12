public class ForEachExample {

    // Phương thức để in các phần tử của mảng
    public void inMang(int[] arr) {
        // Gợi ý: Sử dụng vòng lặp for-each để duyệt qua từng phần tử của mảng
        // Ví dụ: for (int phanTu : arr) { ... }
        for (int phanTu : arr) {
            System.out.print(phanTu + " ");
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp ForEachExample
        ForEachExample forEachExample = new ForEachExample();

        // Tạo mảng số nguyên
        int[] arr = {10, 20, 30, 40, 50};

        // Gọi phương thức in mảng
        forEachExample.inMang(arr);
    }
}
