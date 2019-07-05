package P03

import org.scalatest._

class TestP03 extends FlatSpec with Matchers {
  import P03._

  "nth of P03" should "find the nth element of a list" in {
    nth(List(1,2,3,4,5,6,7), 2) should be (3)
  }

  it should "throw NoSuchElementException if an empty list is gave" in {
    a [NoSuchElementException] should be thrownBy {
      nth(Nil:List[Int], 1)
      nth(List(1,2), 2)
    }
  }
}