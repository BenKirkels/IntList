import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDay {

	@Test
	void test() {
		TimeOfDayHM time1 = new TimeOfDayHM(18,25);
		TimeOfDayMtM time2 = new TimeOfDayMtM(335);
		
		time1.setTime(335);
		
		assertEquals(335, time1.getMtM());
		assertEquals(335, time2.getMtM());
		assertEquals(18, time1.getHours());
		assertEquals(18, time2.getHours());
		assertEquals(25, time1.getMinutes());
		assertEquals(25, time2.getMinutes());
		
	}

}
