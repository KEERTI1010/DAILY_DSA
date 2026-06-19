// Write a program to check whether a given number is Friendly pair or not
// A Friendly Pair consists of two numbers having the same abundancy index. The abundancy index is the ratio of the sum of all factors of a number to the number itself. For example, 6 and 28 form a Friendly Pair because both have an abundancy index of 2

import java.util.Scanner;
public class Friendly
{
	public static int sumOfFactor(int n){
	    int sum = 0;
	    for ( int i = 1 ; i <= n ; i++ ){
	        if ( n%i == 0){
	            sum = sum + i;
	        }
	    }
	    return sum ;
	}
	
	public static boolean isFriendlyPair ( int a , int b){
	    int sum1 = sumOfFactor(a);
	    int sum2 = sumOfFactor(b);
	    return (double) sum1 / a == (double)sum2 / b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(isFriendlyPair(a, b)) {
            System.out.println("Its Friendly Pair Num");
        }
        else {
            System.out.println("Its Not a Friendly Pair Num");
        }
	}
}