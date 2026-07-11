//  Write a Program to Find out all Magic numbers present within a given range.........

import java.util.Scanner;
public class MagicalNumSeries
{
	public static boolean isMagicalNumSeries(int n){
	    
	    do{
	    int sum = 0;
	    int digit = 0;
	    while(n>0){
	        digit = n % 10;
	        sum = sum + digit;
	        n = n/10 ;
	    }
	    n = sum;
	    }
	    while(n>=10);
	    return n==1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int k=a ; k<=b ; k++){
		    if(isMagicalNumSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}