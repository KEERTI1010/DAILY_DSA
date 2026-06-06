// Write a program to check whether a given number is prime or not.......

import java.util.Scanner;

public class Prime_Find
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int count = 0 ;
		
		for ( int i=1 ; i<=n ; i++ ){
		    if (n % i == 0){
		        count++ ;
		    }
		}
		if (count==2){
		    System.out.println("Its a Prime Num");
		}
		else{
		    System.out.println("Its not a Prime Num");
		}
	}
}


// Better Version

/*
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        boolean isPrime = true;
        
        if (n<=2){
            isPrime = false;
        }
        
        for (int i=1; i<2; i++ ){
            if( n % 2 == 0 ){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("its a Prime number");
        }
        else{
            System.out.println("its not a Prime number");
        }
	}
}
*/