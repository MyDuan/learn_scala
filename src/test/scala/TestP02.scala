package P02

import org.scalatest._

class TestP02 extends FlatSpec with Matchers {
  import P02._

  "penultimate of P02" should "find the last but one element of a list" in {
    penultimate(List(1,2,3,4,5,6,7)) should be (6)
  }

  it should "throw NoSuchElementException if an empty list is gave" in {
    a [NoSuchElementException] should be thrownBy {
      penultimate(List(1)) should be (1)
      penultimate(Nil:List[Int])
    }
  }
}
