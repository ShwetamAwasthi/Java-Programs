public class RectangleCustomClass {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        rc.setSide(2, 3);
        rc.getArea();
        rc.getPerimeter();
    }
}

class Rectangle {
    int l;
    int h;

    public void setSide(int a, int b) {
        l = a;
        h = b;
    }

    public void getArea() {
        System.out.println(l * h + " cm");
    }

    public void getPerimeter() {
        System.out.println(2 * (l + h) + " cm");
    }
}
