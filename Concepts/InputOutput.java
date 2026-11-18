import java.math.BigInteger;
import java.util.Scanner;

public class InputOutput {
    static void main(){
        /*int a = 10;
        int b = 20;
        System.out.println(a+b);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Num");
        int Num1 = sc.nextInt();
        System.out.println("Enter your Second Num");
        int Num2 = sc.nextInt();
        int ANS = Num1 + Num2;
        System.out.println("Answer is " + ANS);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("Big Integer " + bg);

        System.out.println("Enter Flag Num");
        boolean flag = sc.nextBoolean();

        System.out.println("Enter Short Num");
        int shortVal = sc.nextShort();

        System.out.println("Enter Float Num");
        int floatValue = sc.nextFloat();

        System.out.println("Flag val " + flag);
        System.out.println("Short Val " + shortVal);
        System.out.println("Float Val " + floatValue);

        sc.close();
    }
}
