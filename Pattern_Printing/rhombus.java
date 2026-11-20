package Pattern_Printing;

public class rhombus {
    public static void main(String[] args) {
		int n = 5;
		for(int r = 1; r<=5 ; r++){
		    for(int c= 1; c<=n-r  ; c++){
		        System.out.print(" ");
		    }
		    for(int c= 1; c<=n  ; c++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
