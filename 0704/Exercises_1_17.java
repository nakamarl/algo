import java.util.*;

public class Exercises_1_17{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		
		npira(input);
	}
	
	static void npira(int n){
		int i,j,k;
		for(i=1;i<=n;i++){
			for(j=0;j<n-i;j++){
				System.out.printf(" ");
			}
			for(k=0;k<i*2-1;k++){
				System.out.printf("%d",i);
			}
			System.out.printf("\n");
		}
	}
}
