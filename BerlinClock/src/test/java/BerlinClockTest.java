import static org.junit.Assert.*;

import org.junit.Test;



public class BerlinClockTest {

//	@Test
//	public void testForYellowLightEveryTwoSeconds() {
//		assertEquals("Y", BerlinClock.getSeconds(0));
//		assertEquals("O", BerlinClock.getSeconds(1));
//	}
//	
//	@Test
//	public void testForTopFourHourLamps() {
//		assertEquals("RRRO", BerlinClock.getTopHours(16));
//	}
//	
//	@Test
//	public void testForBottomHourLamps() {
//		assertEquals("ROOO", BerlinClock.getBottomHours(1));
//	}
//	
//	@Test
//	public void testForTopMinutes() {
//		assertEquals("YYYYYYYYYYY", BerlinClock.getTopMinutes(59));
//	}
//	
//	@Test
//	public void testForBottomMinutes() {
//		assertEquals("YYYY", BerlinClock.getBottomMinutes(4));
//	}
	
	
	@Test
	public void testFormattedtime1() {
		assertEquals("ORRRRRRROYYRYYRYYRYYYYYY", BerlinClock.clock("23:59:59"));
	}

	@Test
	public void testFormattedtime2() {
		assertEquals("YOOOOOOOOOOOOOOOOOOOOOOO", BerlinClock.clock("00:00:00"));
	}
	@Test
	public void testFormattedtime3() {
		assertEquals("YRRROROOOYYRYYRYYRYOOOOO", BerlinClock.clock("16:50:06"));
	}
	@Test
	public void testFormattedtime4() {
		assertEquals("ORROOROOOYYRYYRYOOOOYYOO", BerlinClock.clock("11:37:01"));
	}
}
