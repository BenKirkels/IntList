import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		IntList lijst = new IntList();
		lijst.append(6);
		lijst.append(9);
		
		assertEquals(2, lijst.length());
		assertEquals(6, lijst.atIndex(0));
		assertEquals(9, lijst.atIndex(1));
		lijst.remove();
		
	}		
}
