/**
 * @invar 
 * 		| 0 <= getHours() && getHours() < 24
 * @invar
 * 		| 0 <= getMinutes() && getMinutes() < 60
 * @invar
 * 		| 0 <= getMtM() && getMtM() < 24*60
 */
public class TimeOfDayHM {
	/**
	 * @invar
	 * 		| 0 <= hours && hours < 24
	 * @invar
	 * 		| 0 <= minutes && minutes < 60
	 */
	private int hours;
	private int minutes;
	
	/**
	 * @pre
	 * 		| 0 <= hours && hours < 24
	 * @pre
	 * 		| 0 <= minutes && minutes < 60
	 * 
	 * @post 
	 * 		| 0 <= getHours() && getHours() < 24
	 * @post
	 * 		| 0 <= getMinutes() && getMinutes() < 60
	 * @post
	 * 		| 0 <= getMtM() && getMtM() < 24*60 
	 */
	public TimeOfDayHM(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	/**
	 * @pre
	 * 		| 0 <= mtm && mtm < 24*60
	 * 
	 * @post
	 * 		| 0 <= getHours() && getHours() < 24
	 * @post
	 * 		| 0 <= getMinutes() && getMinutes() < 60
	 * @post
	 * 		| 0 <= getMtM() && getMtM() < 24*60 
	 */
	public void setTime(int mtm) {
		this.hours = 23 - (mtm-1)/60;
		this.minutes = 59 - (mtm-1)%60;
	}
	
	
	public int getMtM() {
		return (24*60) - 60*this.hours - this.minutes;
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
}
