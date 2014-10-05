package co.gibar.examples.jenkins.unittest;

import org.junit.Assert;
import org.junit.Test;

public class HolidayTest {

	Holiday holiday = new Holiday();
	
	@Test public void testFriNotHoliday(){
		Assert.assertFalse("Fri 不應該是假日", holiday.isHoliday("Fri"));
	}
	
	@Test public void testSatIsHoliday(){
		Assert.assertTrue("Sat 應該是假日", holiday.isHoliday("Sat"));
	}
	
	@Test public void testSunIsHoliday(){
		Assert.assertTrue("Sun 應該是假日", holiday.isHoliday("Sun"));
	}
}
