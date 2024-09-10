package Q9;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define two 2x2 arrays
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] resultMatrix = new int[2][2]; // To store the result

        // Input values for the first 2x2 matrix
        System.out.println("Nhap ma tran A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input values for the second 2x2 matrix
        System.out.println("Nhap ma tran B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultMatrix[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Ma tran C = A * B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // For new line after each row
        }

        sc.close();
    }
}
