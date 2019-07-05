package P01

import org.scalatest._

class TestP01 extends FlatSpec with Matchers {
  import P01._

  "last of P01" should "find last element of a list" in {
    last(List(1,2,3,4,5,6,7)) should be (7)
    last(List(1)) should be (1)

  }

  it should "throw NoSuchElementException if an empty list is gave" in {
    a [NoSuchElementException] should be thrownBy {
      last(Nil:List[Int]) should be (Nil)
    }
  }
}
