//輸入一個整數，找出這個整數以下的所有質數

import java.util.Scanner;

class PrimeNumber{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int n  = input.nextInt();
		int var,count=0;
		for(int i = 1; i<=n;i++){
			for(int j = 1;j<=i;j++){
				var = i % j;
				if(var == 0){
					count++;
				}

			}
			if(count==2){
				System.out.println(i + "\t");
			}
			count = 0;
		
		}

	}
}