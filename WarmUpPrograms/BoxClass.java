

class BoxClass {

    public int length;
    public int breadth;
    public int height;

    public void SetDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void ShowDimension() {
        System.out.println("Length " + length);
        System.out.println("Breadth " + breadth);
        System.out.println("Height " + height);
    }

    public static void main(String[] args) {
        
        BoxClass smallBox = new BoxClass();
        smallBox.SetDimension(12, 10, 5);
        smallBox.ShowDimension();

       
        
    }
}