package datelab;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMyDate {
  @Test
  public void test2000isALeapYear() {
    // General format of a good Unit (or many other) test is:
    // Setup like this    Given:
    // When I do this...  When:
    // this is the result Then:
    // Tests in this form are "documentation that cannot be wrong"!!!
    assertTrue("2000 should be a leap year", Date.isLeapYear(2000));
  }

  @Test
  public void month3isMarch() {
    // no setup for static methods :(
    String monthName = Date.monthName(3);
    assertEquals("Month 3 should be March", "March", monthName);
  }

  @Test(expected = IllegalArgumentException.class)
  public void badDateIsRejected() {
    new Date(31, 2, 2000);
  }

  @Test
  public void goodDateIsAccepted() {
    new Date(29, 2, 2000);
  }

  @Test
  public void asTextCreatesExpected() {
    Date d = new Date(29, 2, 2000);
    String asText = d.asText();
    assertEquals("Feb 29, 2000 should look like Date: 2/29/2000", "Date: 29/2/2000", asText);
  }

  @Test
  public void jan1_2000IsSaturday() {
    Date d = new Date(1, 1, 2000);
    int dayNum = d.dayOfWeek();
    assertEquals("should be day zero", 0, dayNum);
  }

  @Test
  public void tomorrowFromJan5() {
    Date d = new Date(5, 1, 2000);
    d.tomorrow();
    Date expected = new Date(6, 1, 2000);
    System.out.println("d is " + d.asText());
    assertEquals("Date should be 6, 1, 2000", expected, d);
  }
}
