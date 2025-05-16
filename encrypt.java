import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the grade to be encrypted : " );
        char a = sc.next().charAt(0);
        char b = (char)(a + 8);
        char c = (char)(b - 8);
        System.out.println("encrypted value is : " + b);
        System.out.println("decrypted value is : " + c);
        sc.close();
        

    }

}
