// Write a program to find out all Abundant numbers present within a given range.

import java.util.Scanner;
public class AbudantNumSeries
{
	public static boolean isAbudantSeries(int n){
	    int sum = 0;
	    for (int i=1 ; i<=n/2 ; i++){
	        if(n % i == 0){
	            sum = sum + i;
	        }
	    }
	    return sum > n ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for ( int k=a ; k<=b ; k++){
		    if ( isAbudantSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}