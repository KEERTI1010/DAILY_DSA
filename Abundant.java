//  Write a program to check whether a given number is an Abundant number or not..........
// An Abundant Number is a number whose sum of proper factors is greater than the number itself. For example, 12 is an abundant number because the sum of its proper factors (1 + 2 + 3 + 4 + 6) is 16, which is greater than 12


import java.util.Scanner;
public class Abundant
{
    public static boolean isAbundant(int n){
        int sum = 0;
        int dup = n;
        for(int i = 1; i<=n/2; i++){
        if (n%i==0){
            sum = sum+i ;
        }
    }
    return sum > dup;
}
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		if ( isAbundant(n)){
		    System.out.println("Its a Abundant Num");
		}
		else {
		    System.out.println("Not a Anundant Num");
		}
    }
}