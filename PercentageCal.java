import java.util.Scanner;
public class PercentageCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m1");
        int m1 = sc.nextInt();
        System.out.println("enter m2");
        int m2 = sc.nextInt();
        System.out.println("enter m3");
        int m3 = sc.nextInt();
        System.out.println("enter m4");
        int m4 = sc.nextInt();
        System.out.println("enter m5");
        int m5 = sc.nextInt();
        int sum = m1 + m2 + m3 + m4 + m5;
        int per = (sum*100)/500;
        System.out.print("total mark is: ");
        System.out.println(sum);
        System.out.print("percentage: ");
        System.out.println(per + "%");
        sc.close();
    }
    
}
