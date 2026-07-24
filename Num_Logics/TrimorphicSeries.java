//  Write a Program to Find out all Trimorphic numbers present within a given range..................

import java.util.Scanner;
public class TrimorphicSeries
{
	public static boolean isTrimorphicSeries(int n){

    int cube = n * n * n;
    int temp = n;

    while(temp > 0){

        if(temp % 10 != cube % 10){
            return false;
        }

        temp = temp / 10;
        cube = cube / 10;
    }

    return true;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int k=a ; k<=b ; k++ ){
		    if(isTrimorphicSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}
