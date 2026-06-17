//  Write a Program to check whether the number is Magic Number or Not.........
//  A Magic Number is a number whose repeated sum of digits ultimately becomes 1. For example, 1729 is a Magic Number because 1+7+2+9=19, 1+9=10, and 1+0=1

import java.util.Scanner;
public class Ma
{
	public static boolean isMagical(int n){
	    while(n>=10){
	        int sum = 0;
	        while(n>0){
	           sum = sum + (n%10);
	           n = n / 10 ;
	        }
	        n = sum ;
	    }
	   
	    return n==1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		if (isMagical(n)){
		    System.out.println("Its an Magical Num");
		}
		else{
		    System.out.println("Its not an Magical Num");
		}
	}
}