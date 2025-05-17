import java.util.Scanner;

public class Add2Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[2][3];
        int[][] mat2 = new int[2][3];
        int[][] mat3 = new int[2][3];
        System.out.println("for matrix 1");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print("enter element at " + i + j + " : ");
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("for matrix 2");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print("enter element at " + i + j + " : ");
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("matrix 1");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("matrix 2");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("after addition");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}