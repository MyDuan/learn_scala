package P10

import org.scalatest._

class TestP10 extends FlatSpec with Matchers {
  import P10._

  "encode of P10" should "encode a list" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be
    ( List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
    encode(List()) should be (List())
  }
}