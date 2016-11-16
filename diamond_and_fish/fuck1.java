import java.util.Scanner;
public class fuck1{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // print triangle
        for(int i = 1 ;i<=n;i++){
        	for(int j=1 ;j<=i ;j++){
	        	System.out.print("*");
        	}
    	    System.out.println();
        }
	}
}