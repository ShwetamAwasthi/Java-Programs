import java.util.Scanner;
import java.util.Random;

public class rockpappersissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num = new Random();
        System.out.println("enter your move");
        String a = sc.nextLine();
        int cho = getA(a);
        int ran = num.nextInt(3);
        // loop
        if (cho ==1) {
            if (ran == 0) {
                System.out.println("rock!!! its tie");
            } else if (ran == 1) {
                System.out.println("paper!!! you loose");
            } else if (ran == 2) {
                System.out.println("sissor!!! you win");
            }
        }

        if (cho == 2) {
            if (ran == 0) {
                System.out.println("rock!!! you win");
            } else if (ran == 1) {
                System.out.println("paper!!! its tie");
            } else if (ran == 2) {
                System.out.println("sissor!!! you loose");
            }
        }
        if (cho == 3) {
            if (ran == 0) {
                System.out.println("rock!!! you loose");
            } else if (ran == 1) {
                System.out.println("paper!!! you win");
            } else if (ran == 2) {
                System.out.println("sissor!!! its tie");
            }
        }
        sc.close();
    }

    public static int getA(String a) {
        switch (a.toLowerCase()) {
            case "rock":
                return 1;
            case "paper":
                return 2;
            case "sissor":
                return 3;
            default:
                System.out.println("not valid");
                break;
        }
        return 0;

    }

}