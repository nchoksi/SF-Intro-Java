package datelab;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMyDate {
  @Test
  public void test2000isALeapYear() {
    assertTrue("2000 should be a leap year", Date.isLeapYear(2000));
  }

  @Test
  public void month3isMarch() {
    // no setup for static methods :(
    String monthName = Date.monthName(3);
    assertEquals("Month 3 should be March", "March", monthName);
  }
}
