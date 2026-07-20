// Write a Program to Find out all the Disarium numbers present within a given range..........

import java.util.Scanner;
public class DisariumSeries
{
	public static boolean isDisariumSeries(int n){

    int temp = n;
    int count = 0;

    while(temp > 0){
        temp = temp / 10;
        count++;
    }

    temp = n ;
    int sum = 0  ;

    while(temp > 0){
        int rem = temp % 10;
        sum = sum + (int)Math.pow(rem, count);
        count--;
        temp = temp / 10;
    }

    return sum == n;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for( int k=a ; k<=b ; k++){
		    if(isDisariumSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}