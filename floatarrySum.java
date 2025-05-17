import java.util.Scanner;
public class floatarrySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float []floats = new float[5] ;
        double sum = 0;
        for(int i=0;i<floats.length;i++){
            System.out.println("enter elements at "+i);
            floats[i]=sc.nextFloat();
        }
        for(int i = 0;i<floats.length;i++){
            System.out.println(floats[i]+" ");
            sum += floats[i];
        }        
        System.out.println("sum of array is "+ sum);
        sc.close();
    }
    
}
