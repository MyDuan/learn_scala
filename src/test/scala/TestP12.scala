package P12

import org.scalatest._

class TestP12 extends FlatSpec with Matchers {
  import P12._

  "decode of P12" should "decode a list" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    (List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }
}