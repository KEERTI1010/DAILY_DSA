//  Write a program to find out all Automorphic numbers present within a given range....

import java.util.Scanner;
public class AutomorphicNumSeries
{
	public static boolean isAutomorphicNumSeries(int n){
	    int temp = n;
	    int squrt = n*n;
	    while(temp > 0){
	        if( temp%10 != squrt%10 ){
	            return false;
	        }
	        temp = temp / 10;
	        squrt = squrt / 10;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int k=a ; k<=b ; k++){
		    if(isAutomorphicNumSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}
