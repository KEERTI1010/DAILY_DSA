//  Write a program to check whether a given number is a Harshad number or not............
// A Harshad Number is a number that is divisible by the sum of its digits. For example, 18 is a Harshad Number because 1 + 8 = 9 and 18 is divisible by 9

import java.util.Scanner;
public class Harshad
{
	public static boolean isHarshad(int n){
	    int dup = n;
	    int sum = 0;
	    int mod = 0;
	    
	    while ( n>0 ){
	        mod = n % 10 ;
	        sum = sum + mod;
	        n = n/10;
	    }
	    return dup % sum == 0;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        if (isHarshad(n)){
            System.out.println("Its a Harshad Num");
        }
        else{
            System.out.println("Its Not a Harshad Num");
        }
	}
}