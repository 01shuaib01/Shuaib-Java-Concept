package Constructor;

public class Cons1 {

    private int l;
    private int b;
    private int h;

    public Cons1() {        //CONSTRUCTORS
        System.out.println("Constructor call");
        l = 10;
        b = 5;
        h = 4;
    }

    public void Show() {
        System.out.println("l = " + l);
        System.out.println("b = " + b);
        System.out.println("h = " + h);
    }

    public static void main(String[] args) {
        Cons1 obj = new Cons1();
        obj.Show();
    }
}
