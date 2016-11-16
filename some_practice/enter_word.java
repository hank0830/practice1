import java.util.Scanner;
class enter_word{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("輸入你要的單字");
		String word = input.nextLine();
		System.out.println("輸入你要重複次數");
		int count = input.nextInt();

		for(int i = 1;i<=count;i++){
			System.out.print(word +" ");
		}
		System.out.println();
	}
}