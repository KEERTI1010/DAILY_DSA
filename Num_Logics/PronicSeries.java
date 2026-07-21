// 5. Write a Program to Find out all Pronic numbers present within a given range..........

import java.util.Scanner;
public class PronicSeries
{
	public static boolean isPronicSeries(int n){
	    for( int i=0 ; i<n ; i++){
	        if(i*(i+1) == n){
	            return true;
	        }
	    }
	    return false;
	    
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for ( int k=a ; k<=b ; k++){
		    if (isPronicSeries(k)){
		        System.out.println(k);
		    }
		}
	}
	}