// Write a program to find the Nth Armstrong number....

import java.util.Scanner;

public class Armstrong_nth
{
    public static boolean isArmstrong(int n){
        int temp = n;
        int count = 0;
        
        while(temp > 0){
            count ++ ;
            temp = temp/10;
            
        }
            
            temp =  n;
            int sum = 0;
        
        while(temp > 0){
            int digit = temp % 10;
            int pow = 1;
            
            for(int i = 1 ; i<=count ; i++){
                pow =  pow * digit;
            }
            
            sum = sum + pow;
            temp = temp / 10;
        }
        
        return sum == n;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n =  sc.nextInt();
	    
	    int count = 0 ;
	    int num = 0;
	    
	    while (count < n) {

            if (isArmstrong(num)) {
                count++;
            }

            if (count == n) {
                System.out.println(num);
                break;
            }

            num++;
        }

        sc.close();
    }
}
