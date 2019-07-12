package P15

import org.scalatest._

class TestP15 extends FlatSpec with Matchers {
  import P15._

  "duplicateN of P15" should "duplicate the elements n times in a list" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
    duplicateN(2, List()) should be (List())
  }
}