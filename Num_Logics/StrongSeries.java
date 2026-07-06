// Write a program to find out all Strong numbers present within a given range.......

/*
INPUT 
1 to 500 

OUTPUT = 1 , 2 , 145
*/

import java.util.Scanner;
public class StrongSeries
{
    public static boolean isStrongSeries(int n){
    	int sum = 0;
    	int temp = n;
    
    	while (temp>0){
    	    int digit = temp % 10;
    	    
    	    int fact = 1;
    	    
    	    for(int i=1 ; i<=digit ; i++){
    	        fact = fact*i;
    	       }
    	       sum = sum + fact;
    	       temp = temp / 10;
    	}
    	return sum == n;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for ( int k=a ; k<=b ; k++){
		    if(isStrongSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}
