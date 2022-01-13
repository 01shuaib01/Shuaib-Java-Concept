package WarmUpPrograms;

public class Student {
    private int Roll;
    private String Name;
    private long Number;

    public void SetDetail(int r, String n, long num) {
        Roll = r;
        Name = n;
        Number = num;
    }

    public void ShowDetail() {
        System.out.println("Name = " + Name);
        System.out.println("Roll No = " + Roll);
        System.out.println("Ph.No = " + Number);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.SetDetail(101, "Shuaib", 95577);
        obj.ShowDetail();

    }
}
