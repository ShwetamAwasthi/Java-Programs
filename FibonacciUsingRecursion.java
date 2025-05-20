import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of terms to be printed in series:");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.print(fibo(i)+" ");
        }
        sc.close();
    }
    static int fibo(int a) {    
        if (a <= 1) {
            return a;
        }
        return fibo(a - 1) + fibo(a - 2);
    }
}
