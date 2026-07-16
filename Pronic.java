//  Write a Program to check whether the number is a Pronic Number or Not.........

// A Pronic Number is a number that can be expressed as the product of two consecutive integers. For example, 12 is a Pronic Number because 12 = 3 × 4

/*
0 × 1 = 0
1 × 2 = 2
2 × 3 = 6
3 × 4 = 12
*/

import java.util.Scanner;
public class Pronic
{
	public static boolean isPronic(int n){
	for (int i = 0 ; i<=n ; i++){
	   if (i*(i+1)==n){
	       return true;
	   }
	}
	return false;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (isPronic(n)){
		    System.out.println("Its Pronic Num");
		}
		else{
		    System.out.println("Its not a Pronic Num");
		}
	}
}