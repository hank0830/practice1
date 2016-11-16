/*
連續輸入每位同學的國文成績，每輸入一位同學成績完畢，馬上詢問是否繼續？
當按下"Y" 或"y" 時允許繼續輸入，其他按鍵表示不在繼續輸入，最後計算出
班上國文平均分數，以及最高分同學。
*/
import java.util.Scanner;
import java.util.*;
class Avg_score_1{
	public static void main(String[] args){
		System.out.println("=====國文試算成績=====");
		int i = 1;
 		ArrayList list = new ArrayList();  
  		ArrayList arry = new ArrayList();  
		
 		int total = 0;
 		int high = 0,j=0;

		wh
			//int size = list.size();
			total += grade;ile(true){

			System.out.println(i+ ".   請輸入第" + i +"位同學成績：");
			Scanner input = new Scanner(System.in);
			int grade = input.nextInt();
			//int score[i]=grade;
			list.add(grade);
			i++;
			if(grade>high){
				high = grade;
				j = list.indexOf(grade);
				System.out.println(grade);

			}//比較分數的大小

			System.out.println();
			System.out.print("==是否繼續輸入？ (Y/N)");
			Scanner choose = new Scanner(System.in);
			String s = choose.nextLine();


			if(s.equals("y")||s.equals("Y")){
				continue;
			}//判斷輸入是否為 y,Y  如果是的話就繼續輸入
			else {
				i--;
				System.out.println("一共輸入"+ i +"位同學的成績");
				System.out.println("平均 = " + (total/i));
				System.out.println("第"+ (j+1) + "位同學最高分");

				break;
			}

 		}
 		//嘗試看能不能把並列最高分的全部列出來
 		/*int size = list.size();
 		for(int i = 0; i <= size;i++){
 			if(list.indexOf(i)>list)
 		}*/
			
	}
}