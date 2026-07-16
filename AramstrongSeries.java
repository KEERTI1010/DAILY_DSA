//  Write a program to find out all Armstrong numbers present within a given range.........

/*
INPUT
1
200

OUTPUT
1
2
3
4
5
6
7
8
9
153
*/

import java.util.Scanner;
public class AramstrongSeries
{
	public static boolean isAramstrongSeries(int n){
	    int temp = n;
	    int count = 0;
	    
	    while(temp>0){
	        temp = temp/10;
	        count ++;
	    }
	    
	    int sum = 0;
	    int digit = 0;
	    temp = n;
	    
	    
	     while( temp > 0){
	        digit = temp % 10;
	        int pow = 1;
	        
	        for ( int j=0 ; j<count ; j++){
	            pow = pow * digit;
	        }
	        
	        sum = sum + pow;
	        temp = temp / 10;
	    }
	    return sum == n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for ( int k=a ; k<=b ; k++){
		    if ( isAramstrongSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}