package P13

import org.scalatest._

class TestP13 extends FlatSpec with Matchers {
  import P13._

  "encodeDirect of P13" should "encode a list directly" in {
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be
    ( List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    encodeDirect(List()) should be (List())
  }
}