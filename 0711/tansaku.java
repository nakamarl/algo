class tansaku{
	int search(int[] list,int n,int key){
		int i,j;
		System.out.printf("   |");
		for(i=0;i<n;i++){
			System.out.printf("%4d",i);
		}
		System.out.printf("\n");
		
		System.out.printf("---+");
		for(j=0;j<n;j++){
			System.out.printf("----");
		}
		System.out.printf("--\n");
		
		
		int left = 0;
		int right = n - 1;
		int center;
		format fmt = new format();
		
		while(left <= right){
			center = (left + right) / 2;
			System.out.printf("   |");
			fmt.display(list,center,left,right);
			if(list[center] == key){
				return center;
			}
			else if(list[center] < key){
				left = center + 1;
			}
			else{
				right = center - 1;
			}
		}
		return -1;
	}
}
