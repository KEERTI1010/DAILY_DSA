import java.util.Scanner;

public class XPowerNByFactorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial=1;
		int x = sc.nextInt();
		double pow = Math.pow(x, n);
		
		for(int i=1 ; i<=n ; i++){
		    factorial*=i;
		}
		
		System.out.println(pow/factorial);
	}
}