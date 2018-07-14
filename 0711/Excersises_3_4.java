import java.util.*;

class Excersises_3_4{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] list = {1,2,3,4,5,6,7,8,9};
		
		System.out.printf("探す値:");
		int key = scn.nextInt();
		
		tansaku sch = new tansaku();
		int result = sch.search(list,list.length,key);
		
		if(result == -1){
			System.out.printf("存在しません\n");
		}
		else{
			System.out.printf("その値はlist[" + result + "]にありました\n");
		}
	}
}
