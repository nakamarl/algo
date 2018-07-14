import java.util.*;

class Excersises_3_7{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		search[] list = {
			new search("赤坂忠雄",162,0.3),
			new search("長浜良一",168,0.4),
			new search("加藤富明",173,0.7),
			new search("松富明雄",169,0.8),
			new search("浜田哲明",174,1.2),
			new search("武田信也",171,1.5),
			new search("斉藤正二",175,2.0)
		};
		System.out.print("探す視力は：");
		double vision = scn.nextDouble();
		
		int idx = Arrays.binarySearch(list,new search("", 0, vision),search.VISION_ORDER);

		if (idx < 0){
			System.out.println("その視力のデータは存在しません。");
		}
		else{
			System.out.println("その値はlist[" + idx + "]にあります。");
			System.out.println("データ：" + list[idx]);
		}
	}
}
