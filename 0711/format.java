class format{
	void display(int[] list,int center,int left,int right){
		int i;
		
		if(left != center){
			System.out.printf(String.format("%%%ds<-%%%ds+",(left * 4) + 1, (center - left) * 4),"", "");
		}
		else{
			System.out.printf(String.format("%%%ds<-+",   center * 4 + 1), "");
		}
		
		if(center != right){
			System.out.printf(String.format("%%%ds->\n",(right - center) * 4 - 2), "");
		}
		else{
			System.out.println("->");
		}
		System.out.printf("%3d|", center);
		
		for(i=0;i<list.length;i++){
			System.out.printf("%4d", list[i]);
		}
		System.out.println("\n   |");
	}
}
