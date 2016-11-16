import java.util.Scanner;

class nine_nine {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("please enter the number");
		int n = input.nextInt();

		for(int i = 1 ;i <= n ;i++){
			for(int j = 1 ;j <= n ; j++){
				System.out.print( j + "*" + i + "=" + j*i + "\t");

			}
		System.out.println();
		}

	}
}