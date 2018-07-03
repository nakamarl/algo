import java.util.*;

public class Exercises_1_14{
	public static void main(String[] args) {
		System.out.printf("正方形を表示します\n段数は：");
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		int i,j;
		
		for(i=0;i<input;i++){
			for(j=0;j<input;j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
