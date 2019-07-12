package P11

import org.scalatest._

class TestP11 extends FlatSpec with Matchers {
  import P11._

  "encodeModified of P11" should "encode a list" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    encodeModified(List()) should be (List())
  }
}