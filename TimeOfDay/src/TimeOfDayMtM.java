
public class TimeOfDayMtM {
	private int mtm;
	
	public TimeOfDayMtM(int mtm) {
		this.mtm = mtm;
	}
	
	public void setTime(int mtm) {
		this.mtm = mtm;
	}
	
	public int getMtM() {
		return this.mtm;
	}
	
	public int getHours() {
		return 23 - this.mtm/60;
	}
	
	public int getMinutes() {
		return 60 - this.mtm%60;
	}
}
