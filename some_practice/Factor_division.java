/* 輸入一個整數值，限1-50當因數，並列出 1~100之間可以被這個因數整除的所有整數
，將所有因數以每列顯示個，逐列顯示並統計共有多少個整數能被此因數整除 */
import java.util.Scanner;
class Factor_division{
	public static void main (String[] args){

		System.out.println("輸入你的整數，範圍為1~50");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0,sum = 0;

		System.out.println("==求1到100能被"+ n + "整除的因數==");

		for(int i = 1 ;i <= 100 ;i++){
				if(i % n == 0 ){
					System.out.print(i + "\t");
					sum += 1;
					count += 1;
					if(count == 6){
					System.out.println();
					count = 0;
					}
				}

		}
		System.out.println();
		System.out.println("==由1到100共有"+ sum +"個整數可被" + n +"整除");
	}
}