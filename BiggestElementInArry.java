public class BiggestElementInArry {
    public static void main(String[] args) {
        int[] a = { 1, 23, 54, 666, 95, 45, 10 };
        int big = Integer.MIN_VALUE;
        for (int e : a) {
            if (e > big) {
                big = e;
            }
        }
        System.out.println(big + " is the biggest number");
    }

}
