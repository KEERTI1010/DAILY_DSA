import java.util.Scanner;

public class Palli {

    public static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;

        while(temp > 0){
            int digit = temp % 10 ;
            rev = rev * 10 + digit ;
            temp = temp / 10 ;
        }
        return rev == n ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0 ;
        int num = 1 ;
        while(true){
            if(isPalindrome(num)){
                count++ ;
            }
            if(count == n){
                System.out.println(num);
                break ;
            }
            num++ ;
        }
    }
}