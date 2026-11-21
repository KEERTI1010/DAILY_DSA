package Pattern_Printing;

public class pyramid {
    	public static void main(String[] args) {
	    int n = 5;
		for(int r = 1 ; r<= n; r++){
		    for(int c = 1 ; c<= n-r  ; c++){
		        System.out.print(" ");
		    }
		    for(int c = 1 ; c<= r  ; c++){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}
	}
}
