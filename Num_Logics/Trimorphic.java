// Write a Program to check whether the number is a Trimorphic Number or Not.........
// A Trimorphic Number is a number whose cube ends with the same digits as the number itself. For example, 24 is a Trimorphic Number because 24³ = 13824, which ends with 24



/*
1. For Single Digit
*/
import java.util.Scanner;
public class Trimorphic
{   
	public static boolean isTrimorpic(int n ){
	        int cube = n*n*n;
	        int rem = cube % 10;
	        
	        if (rem == n ){
	            return true;
	        }
	    return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (isTrimorpic(n)){
		    System.out.println("Its is Trimorpic Num");
		}
		else{
		    System.out.println("Its is not a Trimorpic Num");
		}
	}
}