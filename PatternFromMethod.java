import java.util.Scanner;

public class PatternFromMathod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of layers in pattern: ");
        int a = sc.nextInt();
        pat(a);
        sc.close();
    }

    static void pat(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
