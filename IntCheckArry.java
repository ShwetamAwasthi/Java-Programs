import java.util.Scanner;
public class IntCheckArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {12,23,34,54,33};
        // for(int i=0;i<a.length;i++){
        //     System.out.print("enter element at "+i);
        //     a[i] = sc.nextInt();
        // }
        System.out.println("enter no. to be found");
        int b = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(b==a[i]){
                System.out.println("its present at "+i);
            }
            else if(b!=a[i]){
                System.out.println("its not present at "+i);

            }
        }
        sc.close();
    }
    
}
