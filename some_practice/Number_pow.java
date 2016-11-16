import java.util.Scanner;
class Number_pow{
	//計算兩個數字平方

	public static void main (String[] args){
		System.out.println("輸入兩個數字");
		Scanner input1 = new Scanner(System.in);
		//Scanner input2 = new Scanner(System.in);
		int x = input1.nextInt();
		int y = input1.nextInt();
		System.out.println(Math.pow(x,y));
	}

}