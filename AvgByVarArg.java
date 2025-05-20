
public class AvgByVarArg {
    public static void main(String[] args) {
        avg(3, 4);
    }

    static void avg(float... arr) {
        float sum = 0;
        for (float e : arr) {
            sum += e;
        }
        float av = sum / arr.length;
        System.out.println("average of numbers is " + av);
    }
}
