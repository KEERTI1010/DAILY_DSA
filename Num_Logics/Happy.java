// Write a Program to check whether the number is Happy Number or Not...........

// A Happy Number is a number that becomes 1 when repeatedly replaced by the sum of the squares of its digits. For example, 19 is a Happy Number because 1² + 9² = 82, 8² + 2² = 68, 6² + 8² = 100, and 1² + 0² + 0² = 1

import java.util.Scanner;

public class Happy
{
	public static boolean isHappy(int n){
	    while ( n != 0 && n!= 4){
	        int sum = 0;
	        int digit = n%10;
	        while(n>0){
	            sum = sum + (digit*digit);
	            n=n/10;
	        }
	        n = sum ;
	    }
	    return n == 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if (isHappy(n)){
		    System.out.println("Its a Happy Num");
		}
		else{
		    System.out.println("Its not a Happy Num");
		}
	}
}

/*
Unhappy Road

20
↓
4
↓
16
↓
37
↓
58
↓
89
↓
145
↓
42
↓
20
↺ repeats forever


Happy Road

19
↓
82
↓
68
↓
100
↓
1 
*/

