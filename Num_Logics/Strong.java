// Write a program to check whether a given number is a strong number or not.......

/*
A Strong Number is a number whose value is equal to the sum of the factorials of its digits.
*/


import java.util.Scanner;

public class Strong
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int dup = n;
		int sum = 0;
		
		while(n>0){
		    int digit = n % 10;
		    
		    int fact =1;
		    
		    for( int i=1 ; i<=digit ; i++ ){
		        fact = fact * i ;
		    }
		    
		    sum = sum + fact ;
		    n = n / 10;
		}
		
		if ( sum == dup ){
		    System.out.println("Its an Strong Num");
		}
		else{
		    System.out.println("Its not an Strong Num");
		}
	}
}