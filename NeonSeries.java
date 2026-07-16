// Write a Program to Find out all Neon numbers present within a given range..

import java.util.Scanner;
public class NeonSeries
{
	public static  boolean isNeonSeries(int n){
	    int square = n*n ;
	    int sum = 0;
	    while(square > 0){
	        int div = square % 10 ;
	        sum = sum + div ;
	        square = square/10;
	    }
	    return sum == n ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int k=a ; k<=b ; k++ ){
		    if(isNeonSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}