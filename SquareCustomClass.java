public class SquareCustomClass {
    public static void main(String[] args) {
        square sq = new square();
        sq.setSide(10);
        sq.getArea();
        sq.getPerimeter();
    }

}

class square {
    int side;

    public void setSide(int n) {
        side = n;
    }

    public void getArea() {
        System.out.println(side * side + " cm");
    }

    public void getPerimeter() {
        System.out.println(4 * side + " cm");
    }
}
