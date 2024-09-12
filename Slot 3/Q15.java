public class ArrayCopyExample {

    // Phương thức để sao chép phần tử từ mảng nguồn sang mảng đích
    public void saoChepMang(int[] sourceArray, int[] destinationArray, int sourcePos, int destPos, int length) {
        // Gợi ý: Sử dụng System.arraycopy để sao chép các phần tử từ mảng nguồn sang mảng đích
        // Ví dụ: System.arraycopy(sourceArray, sourcePos, destinationArray, destPos, length);
        System.arraycopy(sourceArray, sourcePos, destinationArray, destPos, length);
    }

    public static void main(String[] args) {
        // Tạo đối tượng của lớp ArrayCopyExample
        ArrayCopyExample arrayCopyExample = new ArrayCopyExample();

        // Khởi tạo mảng nguồn
        int[] sourceArray = {10, 20, 30, 40, 50};

        // Khởi tạo mảng đích với kích thước tương tự
        int[] destinationArray = new int[sourceArray.length];

        // Sao chép các phần tử từ mảng nguồn sang mảng đích
        arrayCopyExample.saoChepMang(sourceArray, destinationArray, 0, 0, sourceArray.length);

        // Hiển thị mảng đích sau khi sao chép
        for (int element : destinationArray) {
            System.out.println(element);
        }
    }
}
