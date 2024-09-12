public class RaggedArrayExample {

    // Phương thức để in mảng 
    public void inMangLomChom(int[][] arr) {
        // Gợi ý: Sử dụng vòng lặp lồng nhau để duyệt qua các phần tử trong mảng 
        // Ví dụ: for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; j++) { ... } }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp RaggedArrayExample
        RaggedArrayExample raggedArrayExample = new RaggedArrayExample();

        // Tạo mảng (ragged array)
        int[][] raggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Gọi phương thức in mảng
        raggedArrayExample.inMangLomChom(raggedArray);
    }
}
