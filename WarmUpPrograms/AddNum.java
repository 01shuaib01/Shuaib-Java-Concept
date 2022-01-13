package WarmUpPrograms;

import java.util.Scanner;

//   import Scanner class for taking input from user. 

public class AddNum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // OBJ of Scanner class

        System.out.println("Enter First Number");
        int num1 = kb.nextInt();
        System.out.println("Enter second Number");
        int num2 = kb.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
