package P14

import org.scalatest._

class TestP14 extends FlatSpec with Matchers {
  import P14._

  "duplicate of P14" should "duplicate the elements in a list" in {
    duplicate(List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
    duplicate(List()) should be (List())
  }
}