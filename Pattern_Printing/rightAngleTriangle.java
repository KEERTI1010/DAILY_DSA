package Pattern_Printing;

public class rightAngleTriangle {
    public static void main(String[] args) {
		int n = 5;
		for(int r = 1; r<=5 ; r++){
		    for(int c= 1; c<=r ; c++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
