/*
連續輸入每位同學的國文成績，每輸入一位同學成績完畢，馬上詢問是否繼續？
當按下"Y" 或"y" 時允許繼續輸入，其他按鍵表示不在繼續輸入，最後計算出
班上國文平均分數，以及最高分同學。
*/
import java.util.Scanner;
class Avg_score{
	public static void main(String[] args){
		System.out.println("=====國文試算成績=====");

		System.out.print( "1." + "請輸入第1位同學成績：");
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		int[] score = new int[];
		
		System.out.println();
		System.out.print("==是否繼續輸入？ (Y/N)");
		Scanner choose = new Scanner(System.in);
		String s = choose.nextLine();
		

		if(s.equals("y")||s.equals("Y")){
			for(int i = 2;i<(score.length+1);i++){
				System.out.print( i + ".   請輸入第" + i +"位同學成績：");
				int grade = input.nextInt();
				System.out.println();
				score[i] = grade;


				System.out.print("==是否繼續輸入？ (Y/N)");
 				String m = choose.nextLine();

 				if(m.equals("y")||m.equals("Y")){
 					continue;
 				}
 				else{
 					break;
 				}
			}//判斷輸入是否為 y,Y  如果是的話就繼續輸入
			System.out.println("共輸入"+ score.length +"位同學成績,班上平均成績：");
		}
		/*int j,sum,avg,tmp;
			for(int j = 0;j<score.length;j++){
				tmp = score[i];
				sum += tmp;
			}
			avg = sum / j;
			System.out.println("共輸入"+ j +"位同學成績,班上平均成績：" + avg);
			System.out.println("第" + "位同學最高分");
			*/
	}
}