package Pattern_Printing;

public class common_char2 {
    	public static void main(String[] args) {
		int n= 5;
		for(int r=1 ;r<=n ;r++){
		    for(int c=1 ;c<=r ;c++){

		        int ans = n-c+'A';
		        char finalAns = (char)ans;
		        System.out.print(finalAns + " ");
		    }
		    System.out.println();
		}
	}
}

