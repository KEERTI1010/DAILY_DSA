// Write a Program to check whether the number is Disarium Number or Not............

// A Disarium Number is a number whose digits raised to the power of their respective positions add up to the original number. For example, 135 is a Disarium Number because 1¹ + 3² + 5³ = 135

import java.util.Scanner;
public class Disarium
{
	public static boolean isDisarium(int n){
	    int n2 = n;
	    int count = 0;
	    while  (n2 > 0){
	        n2 = n2/10;
	        count ++;
	    }
	    n2 = n;
	    int sum = 0;
	    while (n2 > 0){
	        int digit = n2 % 10;
	        sum = sum +(int)Math.pow(digit , count);
	        count -- ;
	        n2 = n2/10;
	    }
	    return sum == n;
	}
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(isDisarium(n)) {
            System.out.println("Its Disarium Num");
        }
        else {
            System.out.println("Its not Disarium Num");
        }
    }
}