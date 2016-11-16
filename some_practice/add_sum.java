/*輸入sum 到1+2+.......N <= sum裡，計算出當N為多少時，累加的值會小於等於sum
 ，最後輸出下列格式『1+2+......+N <= sum，累加後的值 ＝ M』*/

 /*ex: enter '28'   ouput 1+2+......+7 <=28，sum = 28 */

import java.util.Scanner;

class add_sum{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		int  m = 0,i = 0,n=1; 
		// M：累加後的值   N：計算出N等於多少的加總會 <= M;
		// 
		System.out.print(n);
		while ( n <= sum){
			n += 1;
			m += n;
			if(m >= sum){
				m -= n;
				System.out.println("<="+ sum +"，累加後的值 = " + (m+1));
				break;
			}	
			System.out.print("+" + n);
		

		}
	}
}