import java.util.Scanner;

public class ArrySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int l = sc.nextInt();
        boolean issor = true;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("enter element at " + i + " : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < l-1; i++) {
            if (a[i] > a[i + 1]) {
                issor = false;
                break;
            }
        }
        if (issor) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }
        sc.close();
    }

}
