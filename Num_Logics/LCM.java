//  Write a program to calculate the LCM of two numbers...........

import java.util.Scanner;

public class LCM
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1;
		int b = num2 ;
		
		while(num2 != 0){
		   int dup = num2 ;
		   num2 = num1 % num2;
		   num1 = dup;
		}
		
		int gcd = num1;
		int lcm = (a*b)/gcd;
		System.out.println(lcm);
	}
}
