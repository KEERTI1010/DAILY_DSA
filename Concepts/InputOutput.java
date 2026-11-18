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
    }
}
