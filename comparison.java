import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter to be compared : ");
        int a = 1000;
        int b = sc.nextInt();
        if(a>b){
            System.out.println("your's smaller brat >_<");
        }
        else{
            System.out.println("your's bigger T_T");
        }
        sc.close();
    }
    
}
