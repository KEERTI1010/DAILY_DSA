// Factorial of Num

import java.util.Scanner;

public class Factorial
{
    public static int factorial(int n){
        
    int  i ;
    int fact = 1;
    
    for ( i=1 ; i<=n ; i++ ){
        fact = fact * i;
    }
    
    return fact;
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        System.out.println(factorial(n));
		
	}
}




/*
import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int n = sc.nextInt();
	int factorial=1;
	
	for (int i=1;i<=n;i++){
	   factorial=factorial*i; 
	}
	System.out.println(factorial);
	
	}
}
*/