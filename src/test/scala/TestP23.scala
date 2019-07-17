package P23

import org.scalatest._

class TestP23 extends FlatSpec with Matchers {
  import P23._

  "randomSelect of P23" should "Extract a given number of randomly selected elements from a list." in {
    randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)).length should be (3)
  }

}
