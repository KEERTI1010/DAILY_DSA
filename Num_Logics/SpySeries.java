// Write a Program to Find out all Spy numbers present within a given range....

import java.util.Scanner;
public class SpySeries
{
	public static  boolean isSpySeries(int n){
	    int sum = 0;
        int pro = 1;

        while(n > 0){

            int rem = n % 10;

            sum = sum + rem;
            pro = pro * rem;

            n = n / 10;
        }

        return sum == pro;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int k=a ; k<=b ; k++ ){
		    if(isSpySeries(k)){
		        System.out.println(k);
		    }
		}
	}
}