// Write a program to calculate G.C.D or HCF of two numbers......

import java.util.Scanner;

public class GCD
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    
	    int gcd = 0;
	    
	    for(int i=1 ; i<num1 && i<num2 ; i++){
	        if( num1 % i == 0 && num2 % i == 0){
	             gcd = i ;
	        }
	    }
	    System.out.println(gcd);
	}
}



/*

DSA Method

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
} */