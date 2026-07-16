//  Write a Program to check whether the number is Spy Number or Not........
// A Spy Number is a number in which the sum of its digits is equal to the product of its digits

import java.util.Scanner;
public class Spy
{
	public static boolean isSpy(int n){
	    int sum = 0 ;
	    int product = 1 ;
	    
	    while(n>0){
	        int digit = n%10; 
	        
	        sum = sum + digit;
	        product = product * digit ;
	        
	        n = n / 10;
	    }
	    return sum == product ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(isSpy(n)){
		    System.out.println("Its a Spy Num");
		}
		else{
		    System.out.println("Its not a Spy Num");
		}
	}
}