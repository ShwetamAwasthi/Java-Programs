import java.util.Scanner;

public class firstNoddnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many odd num to be printed");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
        }

        sc.close();
    }

}
