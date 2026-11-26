package Pattern_Printing;

public class Common_char {
    	public static void main(String[] args) {
		int n= 5;
		for(int r=1 ;r<=n ;r++){
		    for(int c=1 ;c<r ;c++){
		        int a = c;
		        int b = ('A'-1);
		        int ans = a+b;
		        char finalAns = (char)ans;
		        System.out.print(finalAns);
		    }
		    System.out.println();
		}
	}
}


