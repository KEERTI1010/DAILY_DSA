// Write a Program to Find out all Happy numbers present within a given range.......

import java.util.Scanner;
public class HappySeries
{
	public static boolean isHappySeries(int n){
	    while(n != 1 && n != 4){
	        int sum = 0;
	        
	        while(n>0){
	        int rem = n%10;
	        sum = sum + rem*rem;
	        n = n/10;
	        }
	        n = sum ;
	    }
	    return n == 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for( int k=a ; k<=b ; k++){
		    if(isHappySeries(k)){
		        System.out.println(k);
		    }
		}
	}
}