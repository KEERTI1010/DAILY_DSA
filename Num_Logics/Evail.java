// Write a Program to check whether the number is an Evil Number or Not..........

// An Evil Number is a number whose binary representation contains an even number of 1's. For example, 9 is an Evil Number because its binary form is 1001, which contains two 1's


import java.util.Scanner;
public class Evail
{
	public static boolean isEvail(int n ){
	    int count = 0;
	    while (n>0){
	        if ( n%2 == 1){
	            count ++;
	        }
	        n = n/2;
	    }
	    return count%2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (isEvail(n)){
		    System.out.println("Its an Evail Num");
		}
		else{
		    System.out.println("Its not an Evail Num");
		}
	}
}
