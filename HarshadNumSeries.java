// Write a program to find out all Harshad numbers present within a given range.......


import java.util.Scanner;
public class HarshadNumSeries
{
	public static boolean isHarshadNumSeries(int n){
	    int sum = 0;
	    int temp = n;
	    while (n>0){
	        int digit = n % 10;
	        sum = sum + digit;
	        n=n/10;
	        }
	        return ( temp % sum == 0);
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for ( int k=a ; k<=b ; k++){
		    if ( isHarshadNumSeries(k)){
		        System.out.println(k);
		    }
		}
	}
}


/*

INPUT
1
30

OUTPUT
1
2
3
4
5
6
7
8
9
10
12
18
20
21
24
27
30

*/