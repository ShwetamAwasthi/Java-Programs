import java.util.Scanner;
public class IntCheckArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = {12,23,34,54,33};
        // FOR DATA ENTERY
        // for(int i=0;i<a.length;i++){
        //     System.out.print("enter element at "+i);
        //     a[i] = sc.nextInt();
        // }
        boolean g = false;
        System.out.println("enter no. to be found");
        int b = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(b==a[i]){
                g = true;
                break;
            }
        }
        if(g){
            System.out.println("its present in array");
        }
        else{
            System.out.println("not present");
        }
        sc.close();
    }
    
}
