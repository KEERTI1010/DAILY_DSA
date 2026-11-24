package Pattern_Printing;

public class diamond {
    	    public static void main(String[] args) {
	    int n = 4;
		for(int r = 1 ; r<= n; r++){
		    for(int c = 1 ; c<= n-r  ; c++){
		        System.out.print("  ");
		    }
		    for(int c = 1 ; c<= 2*r-1 ; c++){
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}
			for(int r = 1 ; r<= n; r++){
			    if(r==1){
			        continue;
			    }
		    for(int c = 1 ; c<= r-1  ; c++){
		        System.out.print("  ");
		    }
		    for(int c = 1 ; c<= 2*n-2*r+1  ; c++){ // 2n-r-space -> 2n-r-[r-1] -> 2n-2r+1
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}
	}
}
