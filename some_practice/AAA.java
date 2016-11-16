class AAA{
	public static void main (String[] args){
		int var,count=0;
		for(int i = 1; i<=300;i++){
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