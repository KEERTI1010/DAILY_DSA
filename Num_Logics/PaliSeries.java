// Write a program to find out all palindrome numbers present within a given range.........

// A palindrome number is a number that reads the same forward and backward. This program checks every number in the given range and prints all palindrome numbers


import java.util.Scanner;
public class PaliSeries
{
	public static boolean isPaliSeries(int n){
	    int temp = n;
	    int rev = 0;
	    int digit = 0;
	    while (temp>0){
	        digit = temp % 10;
	        rev  = rev * 10 + digit;
	        temp = temp / 10;
	    }
	    return rev == n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		    for ( int i=n ; i<m ; i++){
		        if (isPaliSeries(i)){
		            System.out.println(i);
		        
		    }
		}
	}
}
