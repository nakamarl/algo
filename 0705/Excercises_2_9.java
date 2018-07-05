import java.util.*;

class Excersises_2_9{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.printf("年内の残り日数を表示します\n");
		System.out.printf("年：");
		int year = scn.nextInt();
		System.out.printf("月：");
		int month = scn.nextInt();
		System.out.printf("日：");
		int day = scn.nextInt();
		
		System.out.printf("残り%d日\n",leftDayOfYear(year,month,day));
	}
	
	static int leftDayOfYear(int y,int m,int d){
		int[][] days = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31},
		};
		int lastday = 0;
		int isUruu = ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 1 : 0;
		
		for(int i = m;i<=11;i++){
			lastday += days[isUruu][i];
		}
		lastday += days[isUruu][m-1] - d;
		return lastday;
	}
}
