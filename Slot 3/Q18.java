public class TwoDimensionalArrayExample {

    // Phương thức để in mảng hai chiều
    public void inMangHaiChieu(int[][] arr) {
        // Gợi ý: Sử dụng vòng lặp lồng nhau để duyệt qua các phần tử trong mảng hai chiều
        // Ví dụ: for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { ... } }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
 

    // Phương thức để tính tổng các phần tử trong mảng hai chiều
    public int tinhTongMangHaiChieu(int[][] arr) {
        int tong = 0;
        // Gợi ý: Sử dụng vòng lặp lồng nhau để tính tổng các phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tong += arr[i][j];
            }
        }
        return tong; // Thay bằng câu lệnh để tính tổng
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp TwoDimensionalArrayExample
        TwoDimensionalArrayExample arrayExample = new TwoDimensionalArrayExample();

        // Tạo mảng hai chiều
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Gọi phương thức in mảng hai chiều
        arrayExample.inMangHaiChieu(arr);

        // Tính tổng các phần tử trong mảng hai chiều và hiển thị kết quả
        int tong = arrayExample.tinhTongMangHaiChieu(arr);
        System.out.println("Tong cac phan tu trong mang: " + tong);
    }
}
