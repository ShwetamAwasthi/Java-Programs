import java.util.Scanner;

public class incometx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakhs");
        float i = sc.nextInt();
        float tx;
        float aa = 5.0f;
        float bb = 20.0f;
        float cc = 30.0f;
        float a = (i - 2.5f) * (aa / 100);
        float b = (aa / 100) * (5.0f - 2.5f);
        float bbb = b + (bb / 100) * (i - 5.0f);
        if (i >= 2.5 && i <= 5) {
            tx = i + a;
            System.out.println("your tax is " + a + " lakhs");
            System.out.println("total payable amount is " + tx + " lakhs");
        } else if (i > 5 && i <= 10) {
            tx = i + bbb;
            System.out.println("your tax is " + bbb + " lakhs");
            System.out.println("total payable amount is " + tx + " lakhs");
        } else if (i > 10) {
            float c = bbb + (cc / 100) * (i - 10.0f);
            tx = i + c;
            System.out.println("your tax is " + c + " lakhs");
            System.out.println("total payable amount is " + tx + " lakhs");
        } else {
            System.out.println("gareeb");
        }
        sc.close();
    }
}
