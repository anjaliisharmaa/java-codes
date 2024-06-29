import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get dimensions of the first matrix
        System.out.println("Enter the dimensions of the first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        // Get dimensions of the second matrix
        System.out.println("Enter the dimensions of the second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        // Check if matrix multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }
        // Initialize the first matrix
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        enterMatrixElements(scanner, matrix1);
        // Initialize the second matrix
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        enterMatrixElements(scanner, matrix2);
        // Print the first matrix
        System.out.println("\nFirst Matrix:");
        printMatrix(matrix1);
        // Print the second matrix
        System.out.println("\nSecond Matrix:");
        printMatrix(matrix2);
        // Perform addition
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("\nSum of the matrices:");
        printMatrix(sumMatrix);
        // Perform multiplication
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nProduct of the matrices:");
        printMatrix(productMatrix);
        scanner.close();
    }

    // Method to enter elements of a matrix
    public static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] productMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return productMatrix;
    }
}

