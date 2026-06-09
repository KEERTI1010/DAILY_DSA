//  Write a program to check whether a given number is an Armstrong number or not....

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dup = n;
		int dup_2 = n;
		
		int count = 0;
		
		while(dup > 0){
		    count ++;
		    dup = dup /10;
		}
		
		int sum = 0;
		
		while(n>0){
		    int digit = n % 10;
		    sum = sum + (int)Math.pow(digit , count);
		    n = n/10;
		}
		
		if(sum == dup_2){
		    System.out.println("Its an Armstrong Number");
		}
		else{
		    System.out.println("Its not an Armstrong Number");
		}
	}
}




// Write a program to check whether a only a Three  number is an Armstrong number or not....
/*
import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dup = n;
		int sum = 0;
		
		while(n>0){
		    int digit = n % 10;
		    sum = sum + (digit * digit * digit );
		    n = n / 10;
		}
		
		if ( sum == dup ){
		    System.out.println("Its an Armstrong Num");
		}
		else{
		    System.out.println("Its not an Armstrong Num");
		}
	}
}
*/

