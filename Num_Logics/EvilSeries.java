// Write a Program to Find out all Evil numbers present within a given range.


import java.util.Scanner;
public class EvilSeries
{
	public static boolean isEvilSeries(int n){
	    int count = 0;
	    while(n>0){
	        if(n % 2 == 1){
	            count ++ ;
	        }
	        n = n / 2;
	    }
	    return count % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int k=a ; k<=b ; k++){
		    if(isEvilSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}