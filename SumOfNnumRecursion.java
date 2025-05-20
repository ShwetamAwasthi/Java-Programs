import java.util.Scanner;

public class SumOfNnumRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of numbers to be added");
        int a = sc.nextInt();
        System.out.format("the sum of %d natural numbers is\n %d", a, sum(a));
        sc.close();

    }

    static int sum(int b) {
        if (b == 1) {
            return 1;
        }
        return b + sum(b - 1);
    }

}