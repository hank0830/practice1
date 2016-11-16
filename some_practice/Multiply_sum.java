/*輸入sum到 1*2*3....* N <= sum 裡，計算出當N為多少時，累乘的值會小於等於sum，
最後輸出下列格式：『1*2*3*......* N <= sum ，累乘後的值 = M』。*/


import java.util.Scanner;

class Multiply_sum{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		int  m = 1,i = 0,n=1,k=1; 
		// M：相乘後的值   N：計算出N等於多少的加總會 <= M;
		System.out.print(n);
		while ( n <= sum){
			n++;
			m *= n;
			if(m >= sum){
				m /= n;
				System.out.println("<="+ sum +"，相乘後的值 = " + m);
				break;
			}	
			System.out.print("*" + n);
		
		}
	}
}