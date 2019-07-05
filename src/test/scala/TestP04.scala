package P04

import org.scalatest._

class TestP04 extends FlatSpec with Matchers {
  import P04._

  "length of P04" should "calculate the length of a list" in {
    len(List(1,2,3,4,5,6,7)) should be (7)
    len(Nil:List[Int]) should be (0)
  }
}
