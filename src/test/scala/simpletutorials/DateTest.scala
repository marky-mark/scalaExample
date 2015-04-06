package simpletutorials

import org.junit.{Before, Test}
import org.scalatest.junit.JUnitSuite

class DateTest extends JUnitSuite {

  var date1: Date = new Date(2001, 11, 2)
  var date2: Date = new Date(2011, 11, 2)

  @Before  def init() {}

  @Test def dateTest() {
    assert(date1 < date2)
    assert(date1 != date2)
  }
}
