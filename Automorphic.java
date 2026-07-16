// Write a program to check whether a given number is an Automorphic number or not...........
//An Automorphic Number is a number whose square ends with the same digits as the number itself.


import java.util.Scanner;
public class Automorphic
{
	public static boolean isAutomorphic(int n){
	    int sqr = n*n;
	    while(n>0){
	        if (n % 10 == sqr % 10){
	            return true;
	        }
	        n=n/10;
	        sqr = sqr / 10;
        }
	   
	    return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		if (isAutomorphic(n)){
		    System.out.println("Its an Automorphic Num");
		}
		else{
		    System.out.println("Its not an Automorphic Num");
		}
	}
}