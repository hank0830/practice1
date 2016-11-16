/* 程式開始先產生一個 1-199的亂數，當作被猜的數字，執行過程中我們輸入一個數字，
然後提醒你所猜的數字該大點或小點，並顯示說小猜的範圍，若猜對了，會顯示正確數字。
顯示“賓果！答對了，答案是xxx“總共猜了幾次”  */
import java.util.Scanner;
class guess_number{
	public static void main (String[] args){
		System.out.println("猜數字遊戲");
		int ans = (int)(Math.random()*199+1);
		System.out.print("猜數字範圍 0 < ? < 200 : ");
		int count = 0;	
		int max = 199,min= 0;

		while(true){
			Scanner input = new Scanner(System.in);
			int guess = input.nextInt();
			if(guess == ans){
				count++;
				System.out.println("賓果！！ 您猜了，答案是" + ans +"共猜"+ count + "次");
				break;
			}
			else if(guess > ans){
				count++;
				max = guess;
				System.out.println("猜數字範圍"+min +"<?<"+guess);
				System.out.print("再小一點！！！ 您猜了" + count +"次");
			}
			else if(guess < ans) {
				count++;
				min = guess;
				System.out.println("猜數字範圍"+guess +"<?<"+ max);
				System.out.print("再大一點！！！ 您猜了" + count +"次");

			}
		}
	}
}