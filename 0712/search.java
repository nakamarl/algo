import java.util.*;

class search{
	String name;
	int height;
	double eyesight;

	search(String name,int height,double eyesight){
		this.name = name;
		this.height = height;
		this.eyesight = eyesight;
	}

	public String toString(){
		return name + " " + height + " " + eyesight;
	}

	static final Comparator<search> VISION_ORDER = new VisionOrderComparator();

	static class VisionOrderComparator implements Comparator<search> {
		public int compare(search d1, search d2) {
			return (d1.eyesight > d2.eyesight) ? 1 : (d1.eyesight < d2.eyesight) ? -1 : 0;
		}
	}
}
