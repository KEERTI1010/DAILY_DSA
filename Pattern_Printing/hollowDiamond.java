package Pattern_Printing;

public class hollowDiamond {
    	public static void main(String[] args) {
		 int n=4;
		for(int r=1 ; r<=n ;r++){
		    for(int c=1 ; c<=n-r ; c++){
		        System.out.print("  ");
		    }
		    if(r==1){
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
		for(int r=1 ; r<=(n-1) ;r++){
		    for(int c=1;c<=r;c++){
		        System.out.print("  ");
		    }
		    if(r==n-1){
		        System.out.print("* ");
		    }
		    else{
		        System.out.print("* ");
		        for(int c=1 ; c<=2*(n-r)-3 ; c++){
		        System.out.print("  ");
		    }
		    System.out.print("* ");
		    }
		    System.out.println();
		}
	
	}
}
