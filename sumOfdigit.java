// Write a program to sum all digits of a number....

import java.util.Scanner;

public class sumOfdigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = 0 ;
		int sum = 0 ;
		
		while(n!=0){
		     digit = n%10;
		     sum=sum+digit;
		     n=n/10;
		}
		System.out.println(sum);
	}
}
