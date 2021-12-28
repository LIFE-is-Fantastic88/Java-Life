
public class Date {
	private int d,m,y,hour,min;
	private int[] normal = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private int[] leap = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	public Date() {}
	public Date(int hour,int min) {
		this.hour = hour;
		this.min = min;
	}
	public String getDate() {
		return d+"/"+m+"/"+y;
	}
	public String getTime() {
		return hour+":"+min;
	}
	public boolean checkDate(int day,int month,int year) {
		int[] y = normal;
		if(year%400==0 || year%4==0 && year%100!=0)
			y=leap;
		if(month>y.length-1)
			return false;
		if(day>y[month])
			return false;
		this.d = day;
		this.m = month;
		this.y = year;
		return true;
	}
	public boolean checkReturn(int day,int month,int year) {
		if(checkDate(day,month,year)) {
			if(y<year)
				return false;
			if(y==year) {
				if(month>m)
					return false;
				if(month==m && day>d)
					return false;
			}
			return true;
		}
		return false;
	}
	public boolean checktime(int hour,int min) {
		if(hour>23)
			return false;
		if(min>59)
			return false;
		this.hour = hour;
		this.min = min;
		return true;
	}
	public boolean checkrdate(int hour,int min) {
		if(checktime(hour,min)) {
			if(this.hour>hour)
				return false;
			if(this.min>min)
				return false;
			return true;
		}
		return false;
	}
}
