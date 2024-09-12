public class ArrayOperations {

    // Phương thức để tính tổng các phần tử trong mảng
    public int tinhTong(int[] arr) {
        // Gợi ý: Sử dụng vòng lặp for để tính tổng các phần tử của mảng
        int tong = 0;
        for (int num : arr) {
            tong += num;
        }
        return tong; // Thay bằng câu lệnh để tính tổng
    }

    // Phương thức để tính trung bình các phần tử trong mảng
    public double tinhTrungBinh(int[] arr) {
        // Gợi ý: Sử dụng tổng đã tính và chia cho độ dài của mảng
        int tong = tinhTong(arr);
        return (double) tong / arr.length; // Thay bằng câu lệnh để tính trung bình
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp ArrayOperations
        ArrayOperations arrayOperations = new ArrayOperations();

        // Tạo mảng số nguyên
        int[] arr = {1, 2, 3, 4, 5};

        // Tính tổng và trung bình của các phần tử trong mảng
        int tong = arrayOperations.tinhTong(arr);
        double trungBinh = arrayOperations.tinhTrungBinh(arr);

        // Hiển thị kết quả
        System.out.println("Tong cua cac phan tu trong mang: " + tong);
        System.out.println("Trung binh cua cac phan tu trong mang: " + trungBinh);
    }
}
