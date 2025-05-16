import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark 1");
        double a = sc.nextInt();
        System.out.println("enter mark 2");
        double b = sc.nextInt();
        System.out.println("enter mark 3");
        double c = sc.nextInt();
        double tper = (a + b + c) / 300 * 100;
        double aper = (a / 100) * 100;
        double bper = (b / 100) * 100;
        double cper = (c / 100) * 100;
        if (tper >= 40 && aper >= 33 && bper >= 33 && cper >= 33) {
            System.out.println("----pass----\n" + "total percentage : " + tper);
            System.out.println("each sub mark :" + "\na = " + aper + "\nb = " + bper + "\nc = " + cper);
        } else {
            System.out.println("----fail----\n" + "total percentage : " + tper);
            System.out.println("each sub mark : " + "\na = " + aper + "\nb = " + bper + "\nc = " + cper);
        }
        sc.close();

    }

}
