//  Write a Program to check whether the number is Sunny Number or Not..........

// A Sunny Number is a number whose next number is a perfect square. For example, 8 is a Sunny Number because 8 + 1 = 9, and 9 is a perfect square

import java.util.Scanner;
public class Sunny
{
	public static boolean isSunny(int n){
	        int num = n +1;
	        int num2 = (int)Math.sqrt(num);
	        int num3 = num2*num2;
	    return num == num3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isSunny(n)){
		    System.out.println("Its Sunny Num");
		}
		else{
		    System.out.println("Its not Sunny Num");
		}
	}
}