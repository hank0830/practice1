import java.util.*;
class triangle{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("Size of Triangle: ");
		int size=input.nextInt();
		prints(size);
	}
	static void prints(int size){
		for(int i=0;i<size;i++){
			for(int k=0;k<size-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}