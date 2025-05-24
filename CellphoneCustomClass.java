class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("vibrating...");
    }
}

public class CellphoneCustomClass {
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        cp.ring();
        cp.vibrate();
    }

}
