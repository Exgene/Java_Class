import java.util.Scanner;

public class JAVA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for the second matrix:");
        int rows2 = input.nextInt();
        int cols2 = input.nextInt();

        if (cols1 != rows2) {
            System.out.println("Error: The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        
        input.close();

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("The product of the two matrices is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

