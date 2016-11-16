//題目：輸入一個正整數，計算這個正整數有幾個數字  
//EX 123123;  print 有 6 個數字

import java.util.Scanner;
class count_number{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	System.out.println("enter your number");
	int count = 0;
	String s = String.valueOf(n);
	int t = s.length();
	int a = 0,tmp,i = 0;
	System.out.println("1.------總共有" + t + "個數字------");




	/*for (i = 0 ;i<=; i++){
		a = n % 10;
		tmp = n - a ;	
		count += 1;
		n = tmp / 10;	
		
		}//用for寫  有bug
	System.out.println("2.------總共有" + count + "個數字--------");
	
	*/  //假設已知執行的次數，會比較好做


	//使用while的寫法
	while(n != 0){
		a = n % 10;
		tmp = n - a ;
		count += 1;
		n = tmp / 10;
		i++;	
	}
	System.out.println("3.------總共有"+ count + "個數字------");


	/*do 
		{
			if (n / 10 >= 1){
				count += 1 ;
				continue;
			}
			else {
				break;
			}

		}while(n < 1);
	System.out.println("2.總共有" + count + "個數字");
    */  //錯誤，怎麼算都只有一次
	}
}