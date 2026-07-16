// Write a program to find out all Perfect numbers present within a given range.........

/*
6 => Divisors: 1, 2, 3 => Sum = 6 
28 => Divisors: 1, 2, 4, 7, 14 => Sum = 28 
*/

import java.util.Scanner;

public class PerfectNumSeries
{   
    public static boolean isPerfectNumSeries(int n){
            int sum = 0;
            
            for(int i=1 ; i<=n/2 ; i++){
                if( n%i == 0){
                    sum = sum + i;
                }
            }
            return sum == n;
        }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for ( int k=a ; k<=b ; k++){
		    if ( isPerfectNumSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}