package P08

import org.scalatest._

class TestP08 extends FlatSpec with Matchers {
  import P08._

  "compress of P08" should "compress a list" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be (List('a, 'b, 'c, 'a, 'd, 'e))
  }
}

