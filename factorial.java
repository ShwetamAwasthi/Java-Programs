import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int a = sc.nextInt();
        int b = 1;
        for (int i = a; i >= 1; i--) {
            b = b * i;
        }
        System.out.println(b + " is the factorial");
        sc.close();
    }

}
