import java.util.Scanner;

public class multiplicatiomtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of which you want multiplication table:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            int re = i * n;
            System.out.println(n + "X" + i + "=" + re);
            sum += re;
        }
        // FOR SUM
        System.out.printf("sum of numbers in table %d ",sum);
        // FOR REVERSE MULTIPLICATION TABLE
        // for (int i = 10; i >= 0; i--) {
        // int re = i * n;
        // System.out.println(n + "X" + i + "=" + re);
        // }

        sc.close();

    }

}
