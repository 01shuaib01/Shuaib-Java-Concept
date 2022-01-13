package ThisKeyword;

public class thisProgram {
    private int l, b, h;

    public void SetDimension(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void show(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }

    public static void main(String[] args) {
        thisProgram obj = new thisProgram();
        obj.SetDimension(12, 10, 5);
        obj.show();
    }
}
