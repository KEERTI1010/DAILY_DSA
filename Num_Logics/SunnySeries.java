// Write a Program to Find out all Sunny numbers present within a given range...

import java.util.Scanner;
public class SunnySeries
{
	public static boolean isSunnySeries(int n){
    int sum = n + 1;
    int root = (int)Math.sqrt(sum);
    int pro = root * root ;
    return pro == sum;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for( int k=a ; k<=b ; k++){
		    if(isSunnySeries(k)){
		        System.out.println(k);
		    }
		}
	}
}