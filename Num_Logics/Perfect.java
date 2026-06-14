// Write a program to check whether a given number is a perfect number or not.......... 
// A perfect number is a number whose value is equal to the sum of all its proper factors excluding itself. For example, 6 is a perfect number because 1 + 2 + 3 = 6

import java.util.Scanner;

public class Perfect
{
    
    public static boolean isPerfect(int n){
        
        int sum = 0;
        
        for ( int i=1 ; i<n ; i++ ){
            if ( n%i==0){
                 sum = sum + i;
            }
        }
        return sum == n;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		if(isPerfect(n)){
		    System.out.println("Its a Perfect Num");
		}
		else {
		    System.out.println("Its not a Perfect Num ");
		}
	}
}
