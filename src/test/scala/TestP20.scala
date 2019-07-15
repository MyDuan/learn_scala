package P20

import org.scalatest._

class TestP20 extends FlatSpec with Matchers {
  import P20._

  "removeAt of P20" should "Remove the Kth element from a list." in {
    removeAt(2, List('a, 'b, 'c, 'd)) should be (List('a, 'b, 'd),'c)
  }

  it should "throw NoSuchElementException if an empty list or minus n is gave" in {
    a [NoSuchElementException] should be thrownBy {
      removeAt(-1, List('a, 'b, 'c, 'd))
    }
  }
}
