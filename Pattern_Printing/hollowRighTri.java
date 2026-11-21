package Pattern_Printing;

public class hollowRighTri {
        	public static void main(String[] args) {
		int n = 5;
		for(int r = 1; r<=n ; r++){
		        if(r==1 || r==2 | r==n){
		            for(int c=1 ; c<= r ; c++){
		                System.out.print("* ");
		            }
		        }
		        else{
		            System.out.print("* ");
		            for(int c=1 ; c<=(r-2) ; c++){
		                System.out.print("  ");
		            }
		            System.out.print("* ");
		        }
		    
		    System.out.println();
		}
	}
}
