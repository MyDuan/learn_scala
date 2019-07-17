package P24

import org.scalatest._

class TestP24 extends FlatSpec with Matchers {
  import P24._
  "lotto of P24" should "Draw N different random numbers from the set 1..M." in {
    lotto(5, 50).length should be (5)
  }
}
