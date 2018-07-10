import java.util.*;

class Exercises_2_11{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.printf("西暦何年？");
		int y = scn.nextInt();
		System.out.printf("何月？");
		int m = scn.nextInt();
		System.out.printf("何日？");
		int d = scn.nextInt();
		
		
		YMD ymd = new YMD(y,m,d);
		System.out.printf("何日後/前？");
		int n = scn.nextInt();
		
		
		YMD aft = ymd.after(n);
		System.out.printf("%d日後は%d/%d/%d\n",n,aft.year,aft.month,aft.day);
		YMD bef = ymd.before(n);
		System.out.printf("%d日前は%d/%d/%d\n",n,bef.year,bef.month,bef.day);
	}
}
