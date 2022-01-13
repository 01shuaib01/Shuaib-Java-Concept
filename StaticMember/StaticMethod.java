package StaticMember;

public class StaticMethod {
    static void myMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void method(){
        System.out.println("Non static method need to called with crating objects");
    }
    public static void main(String[] args) {
        myMethod(); //static method.
        StaticMethod obj = new StaticMethod();
        // obj.myMethod(); //optionl
        obj.method();
    }
}
