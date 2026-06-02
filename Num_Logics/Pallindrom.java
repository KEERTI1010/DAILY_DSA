// Write a program to check the given number is a palindrome or not....

import java.util.Scanner;

public class Pallindrom
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dup=n;
		int rem=0;
		int rev=0;
		
		while(n!=0){
		    rev = n%10;
		    rem=rem*10+rev;
		    n=n/10;
		}
		if(rem==dup){
		    System.out.println("Enetered num is Pallindrom");
		}
		else{
		    System.out.println("Entered num is not a Pallindrom");
		}
	}
}