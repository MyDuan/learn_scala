package P07

import org.scalatest._

class TestP07 extends FlatSpec with Matchers {
  import P07._

  "flatten of P07" should "flatten a list" in {
    flatten((List(List(1, 1), 2, List(3, List(5, 8))))) should be (List(1, 1, 2, 3, 5, 8))
  }
}

