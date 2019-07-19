package P26

import org.scalatest._

class TestP26 extends FlatSpec with Matchers {
  import P26._
  "combinations of P26" should "Generate a random permutation of the elements of a list." in {
    combinations(2, List('a, 'b, 'c)) should be (List(List('a, 'b), List('a, 'c), List('b, 'c)))
  }

  "combinations2 of P26" should "Generate a random permutation of the elements of a list." in {
    combinations2(2, List('a, 'b, 'c)) should be (List(List('a, 'b), List('a, 'c), List('b, 'c)))
  }
}
