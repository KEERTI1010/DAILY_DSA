package Pattern_Printing;

public class hollow_tri {
    	public static void main(String[] args) {
	    int n=5;
		for(int r=1 ; r<=n ;r++){
		    for(int c=1 ; c<=n-r ; c++){
		        System.out.print("  ");
		    }
		    if(r==1 || r==n){
		        for(int c=1 ; c<=2*r-1 ; c++){
		            System.out.print("* ");
		        }
		    }
		    else{
		        System.out.print("* ");
		        for(int c=1 ; c<=2*r-3 ; c++){
		            System.out.print("  ");
		        }
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
