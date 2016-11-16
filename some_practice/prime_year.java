import java.util.Scanner;
import java.util.*;
class prime_year{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("輸入你要的年份間距");
		int a = input.nextInt();
		int b = input.nextInt();
		ArrayList year = new ArrayList();
		int tmp;
		if(b < a){
			tmp = a;
			a = b;
			b = tmp;
		}
		for(int i = a;i<=b;i++){
			if(i%400==0){
				
				year.add(i);
			}
			else if ((i%4==0)&&(i%100!=0)){
				year.add(i);
			}
		}
		int size = year.size();
		System.out.print("共有");
		
		for(int j = 0;j<size;j++){
			System.out.print(year.get(j)+" ");
		}
		System.out.println("這"+ size +"個閏年");	
	}
}