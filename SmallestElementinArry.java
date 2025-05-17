public class SmallestElementinArry {
    public static void main(String[] args) {
        int[] a = { -1, 23, 54, 666, 95, 45, 10 };
        int sml = Integer.MAX_VALUE;
        for (int e : a) {
            if (e < sml) {
                sml = e;
            }
        }
        System.out.println(sml + " is the smallest number");
    }

}
