import java.util.Scanner;
public class diamond{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(" print serval start");
		//print diamond upper
		for(int i = 1 ; i <= n ; i++){
			printChar(n - i,' ');
			printChar(2*i-1,'*');
			System.out.println();
		}
		//print diamond under
		for(int i = n-1; i >= 1 ; i--){
			printChar(n - i,' ');
			printChar(2*i-1,'*');
			System.out.println();
		}
		System.out.println();
		//右下直角三角形
		for(int i = 1 ; i <= n ; i++){
			printChar(n-i , ' ');
			printChar(2* i -i , '*');
			System.out.println();
		}
		System.out.println();
		//printfish
		for(int i = 1 ; i <= n ; i++){
			printChar(n-i,' ');
			printChar(2*i-1,'*');
			printChar(n-i,' ');
			printChar(n-i,' ');
			printChar(2*i-i,'*');
			System.out.println();

		}
		for(int i = n-1;i>=1;i--){
			printChar(n-i,' ');
			printChar(2*i-1,'*');
			printChar(n-i,' ');
			printChar(n-i,' ');
			printChar(2*i-i,'*');
			System.out.println();
		}
		System.out.println();
		//the other print fish
		for(int i = 1 ; i <= n ;i++){
			printChar((n-i) * 2,' ');
			printChar(4 * i- 2,'*');
			printChar( (n-i)*2 +(n-i),' ');
			printChar(i-1,'*');
			System.out.println();
		}

		for(int i = n-1; i >= 1 ; i--){
			printChar((n-i) * 2,' ');
			printChar(4 * i- 2,'*');
			printChar( (n-i)*2 +(n-i),' ');
			printChar(i-1,'*');
			System.out.println();
		}

	}

	public static void printChar(int n,char c ){
		for(int i = 1 ;i <= n ;i++){
			System.out.print(c);
		}
	}
}