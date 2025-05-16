import java.util.Scanner;

public class CalKmToMi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter km");
        double km = sc.nextInt();
        double mi = (km*0.621371);
        System.out.println(km + "km equals to " + mi + "miles");
        sc.close();
    }

    
}
