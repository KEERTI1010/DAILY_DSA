// Write a program to find out all perfect square numbers present within a given range. 

// This program prints all perfect square numbers within the given range by checking each number using the isPerfectSquare() function

import java.util.Scanner;
public class SquareSeries
{
	public static boolean isSquareSeries(int n){
	for ( int i = 0 ; i<=n ; i++ ){
	    if ( i * i == n){
	        return true;
	    }
	    
	}
	return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int i=a ; i<=b ; i++){
                if (isSquareSeries(i)){
                    System.out.println(i);
            }
        }
	}
}