/*
驗證密碼，密碼為ttyu ，若輸入三次錯誤，則顯示“密碼錯誤，無法進入”

*/

import java.util.Scanner;

class authenticate_account{
	public static void main (String[] args){
		System.out.println("請輸入密碼（四個字元）:");
		for(int i = 1; i <= 3;i++){
			Scanner input = new Scanner(System.in);
			String w = input.nextLine();
				if(w.equals("ttyu")){
					System.out.println("Login 成功，歡迎進入系統！！");
					break;
				}

				else if(i==3){
					System.out.println("密碼錯誤" + i +"次，請重新輸入");
					System.out.println("密碼錯誤，無法進入");
					break;
				}
				else{
					System.out.println("密碼錯誤" + i +"次，請重新輸入");
				}
		}

	}
}