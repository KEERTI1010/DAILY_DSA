package Pattern_Printing;

public class butterfly {
    	public static void main(String[] args) {
	    int n=4 ;
	    for(int r=1 ; r<=n ; r++){
	        for(int  c=1 ; c<=r ; c++){
	            System.out.print("* ");
	        }
	        for(int c=1 ; c<=2*(n-r) ; c++){
	            System.out.print("  ");
	        }
	        for(int c=1  ; c<=r ; c++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    	for(int r=2 ; r<=n ; r++){
	    	    for(int c=1 ; c<=n-r+1 ; c++){
	    	        System.out.print("* ");
	    	    }
	    	    for(int c=1 ; c<=2*(r-1); c++){
	    	        System.out.print("  ");
	    	    }
	    	    for(int c=1 ; c<=n-r+1 ; c++){
	    	        System.out.print("* ");
	    	    }
	    	    System.out.println();
	    	}
	}
}
