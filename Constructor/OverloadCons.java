package Constructor;

public class OverloadCons {
    private int l,b,h;

    public OverloadCons(){
        l = 10;
        b = 20;
        h = 5;
    }
    public OverloadCons(int L,int B,int H){
        l = L;
        b = B;
        h = H;
    }

    public void Show(){
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }
    public static void main(String[] args){
        OverloadCons obj = new OverloadCons();
        OverloadCons obj2 = new OverloadCons(20,25,15);
        // obj.Show();
        obj2.Show();
    }
}
