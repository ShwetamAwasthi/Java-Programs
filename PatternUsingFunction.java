public class PatternUsingFunction {
    public static void main(String[] args) {
        int a = 5;
        pattern(a);
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
