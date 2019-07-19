package P25

import org.scalatest._

class TestP25 extends FlatSpec with Matchers {
  import P25._
  "randomPermute of P25" should "Generate a random permutation of the elements of a list." in {
    List(randomPermute(List('a, 'b))) should contain oneOf (List('a, 'b), List('b, 'a))
  }
}
