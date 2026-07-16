import java.util.Scanner;

public class Odd_Even
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n==0){
		    System.out.println("Entered Number is Zeroo");
		}
		else if (n%2==0){
		    System.out.println("Entered number is an Even num");
		}
		else{
		    System.out.println("Entered Number is an Odd num");
		}
	}
}