import java.util.Scanner;
public class ReverseArry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the length of Array");
        int l = sc.nextInt();
        int []arr = new int[l];
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<arr.length;i++){
            System.out.print("enter number at "+i+" : ");
            arr[i]= sc.nextInt();
        }
        System.out.println("normal array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        System.out.println();
        System.out.println("reversed array");
        for(int element:arr){
            System.out.print(element+" ");
        }        
        sc.close();
    }
    
}
