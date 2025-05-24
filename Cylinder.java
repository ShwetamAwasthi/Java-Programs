import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius ");
        int a = sc.nextInt();
        System.out.print("enter height ");
        int b = sc.nextInt();
        Cylinder1 cyn = new Cylinder1(a, b);
        cyn.setRadius(a);
        cyn.setheight(b);
        System.out.println(cyn.getRadius());
        System.out.println(cyn.getheight());
        System.out.println(cyn.getVolume());
        System.out.println(cyn.getSurfaceArea());
        rectangle rec = new rectangle();
        System.out.println(rec.getbr());
        System.out.println(rec.getlen());

        sc.close();
    }
}

class Cylinder1 {
    private int r;
    private int h;

    public Cylinder1(int a, int b) {
        a = r;
        b = h;
    }

    public void setRadius(int a) {
        r = a;
    }

    public int getRadius() {
        return r;
    }

    public void setheight(int a) {
        h = a;
    }

    public int getheight() {
        return h;
    }

    public double getSurfaceArea() {
        return 2 * 3.14 * r * (r + h);
    }

    public double getVolume() {
        return 3.14 * (r * r) * h;

    }
}

class rectangle {
    int l;
    int br;

    public rectangle() {
        l = 4;
        br = 5;
    }

    public rectangle(int a, int b) {
        l = a;
        br = b;
    }

    public int getlen() {
        return l;
    }

    public int getbr() {
        return br;
    }
}
