import java.util.Arrays;

public class ArraySortExample {

    // Phương thức để sắp xếp mảng số nguyên
    public void sapXepMang(int[] arr) {
        // Gợi ý: Sử dụng phương thức Arrays.sort() để sắp xếp mảng
        // Ví dụ: Arrays.sort(arr);
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp ArraySortExample
        ArraySortExample arraySortExample = new ArraySortExample();

        // Tạo mảng số nguyên
        int[] arr = {50, 20, 40, 10, 30};

        // Gọi phương thức sắp xếp mảng
        arraySortExample.sapXepMang(arr);

        // Hiển thị mảng sau khi sắp xếp
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }
}
