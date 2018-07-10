class YMD{
	int year;
	int month;
	int day;
		
	YMD(int y,int m,int d){
		this.year = y;
		this.month = m;
		this.day = d;
	}
	
	int[][] days = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31},
	};
	int isUruu = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;
	
	
	YMD after(int n){
		YMD aft = new YMD(year,month,day);
		if(n<0){
			return before(-n);
		}
		
		aft.day += n;

		while (aft.day > days[isUruu][aft.month-1]){
			aft.day -= days[isUruu][aft.month-1];
			if (++aft.month > 12){
				aft.year++;
				aft.month = 1;
			}
		}
		return aft;
	}


	YMD before(int n){
		YMD bef = new YMD(year,month,day);
		if(n<0){
			return after(-n);
		}
		
		bef.day -= n;

		while(bef.day < 1){
			if(--bef.month < 1){
				bef.year--;
				bef.month = 12;
			}
			bef.day += days[isUruu][bef.month-1];
		}
		return bef;
	}
}
