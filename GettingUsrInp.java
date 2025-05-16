import java.util.Scanner;
public class GettingUsrInp {

    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1");
        int a= sc.nextInt();
        System.out.println("enter no 2");
        int b =sc.nextInt();
        int sum = a + b;
        System.out.println("sum of number is");
        System.out.println(sum);
        sc.close();


    }
}