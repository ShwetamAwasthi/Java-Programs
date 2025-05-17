import java.util.Scanner;

public class AvgInArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of students:");
        int s = sc.nextInt();
        int sum = 0;
        int[] phy = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("enter mark of student "+i+" : ");
            phy[i] = sc.nextInt();
        }
        for (int element : phy) {
            System.out.print(element + " ");
            sum += element;
        }
        int avg = sum / s;
        System.out.println("average of all students physics marks is " + avg);
        sc.close();
    }

}
