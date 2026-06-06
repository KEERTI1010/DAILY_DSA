// Write a program to check whether a given number is a perfect square number or not...............

import java.util.Scanner;

public class isSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        boolean isSquare = false;
        
        for (int i=1; i<=n; i++ ){
            if( i*i == n ){
                isSquare = true;
                break;
            }
        }
        if(isSquare){
            System.out.println("its a Square number");
        }
        else{
            System.out.println("its not a Square number");
        }
	}
}


