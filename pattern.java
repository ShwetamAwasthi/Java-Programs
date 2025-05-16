import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers of layer(ex. 4 = 7layer[2n-1]):");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = i;
            for (int j = (2 * i + 1); j > 0; j--) {
                while (c < n) {
                    System.out.print(" ");
                    c++;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = n - 1; i > 0; i--) {
            int c = i - 1;
            for (int j = 0; j < (2 * i - 1); j++) {
                while (c < n) {
                    System.out.print(" ");
                    c++;
                }
                System.out.print("*");
            }
            System.out.print("\n");

        }
        sc.close();
    }
}
