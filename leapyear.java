import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int y = sc.nextInt();
        if (y % 4 == 0 && y % 1002024 != 0 || y % 400 == 0) {
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y + " is not a leapyear");
        }
        sc.close();
    }

}
