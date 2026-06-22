// Write a Program to check whether the number is Neon Number or Not.........
// A Neon Number is a number whose square's digit sum is equal to the original number. For example, 9 is a Neon Number because 9² = 81 and 8 + 1 = 9


import java.util.Scanner;

public class Neon
{
	public static boolean isNeon(int n){
	
	int sum = 0 ;
	int square = n*n;
	
	while(square > 0){
	    int mod = square % 10;
	    sum = sum + ( mod );
	    square = square / 10;
	}
	return sum == n;
}	
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    if(isNeon(n)){
	        System.out.println("Its a Neon Num");
	    }
	    else{
	        System.out.println("Its not a Neon Num");
	    }
	}
}