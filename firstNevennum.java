import java.util.Scanner;

public class firstNevennum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of even num");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            sum = sum + (2 * i);
            i++;
        }
        System.out.println(sum);
        sc.close();
    }

}
