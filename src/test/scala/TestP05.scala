package P05

import org.scalatest._

class TestP05 extends FlatSpec with Matchers {
  import P05._

  "reverse of P05" should "reverse a list" in {
    reverse(List(1,2,3)) should be (List(3,2,1))
    reverse(List(1)) should be (List(1))
    reverse(Nil:List[Int]) should be (Nil)
    reverseAnswer1(List(1,2,3)) should be (List(3,2,1))
    reverseAnswer1(List(1)) should be (List(1))
    reverseAnswer1(Nil:List[Int]) should be (Nil)
    reverseAnswer2(List(1,2,3)) should be (List(3,2,1))
    reverseAnswer2(List(1)) should be (List(1))
    reverseAnswer2(Nil:List[Int]) should be (Nil)
  }
}