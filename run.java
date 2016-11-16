import java.util.*;
public class run{
	private static int count = 0;
	public static void run(int target, int[] distance){
		int[] result = new int [distance.length];
		run(target, 0,distance,result,0);
	}
	private static void run(int target,int from,int[] distance,int[] result,int got){
		
		if(target <= 0){
			if(target ==0){
				for(int i=0;i<got;i++)
					  System.out.print(result[i]+"");
					 System.out.println();
					count ++;
			}
			return;
		}
		for(int i = from;i<distance.length;i++){
			result[got]= distance[i];
			run(target-distance[i],i + 1,distance,result,got+1);
		}
	}
	public static void main (String[] argv)
	{
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		int n = input.nextInt();
		int[] distance = new int[n];
		for(int i=0; i<n; i++)
		     distance[i]=input.nextInt();
   		run(target,distance);
   		System.out.println("count:"+count);
	}
}




