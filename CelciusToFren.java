import java.util.Scanner;

public class CelciusToFren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter temprature in celcius");
        int cel = sc.nextInt();
        System.out.println("temprature in fahrenhiet is " + fra(cel));
        sc.close();
    }

    static float fra(int a) {
        return (a * 9 / 5) + 32;
    }

}
