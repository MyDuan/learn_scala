package P21

import org.scalatest._

class TestP21 extends FlatSpec with Matchers {
  import P21._

  "insertAt of P21" should "Insert an element at a given position into a list." in {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) should be (List('a, 'new, 'b, 'c, 'd))
    insertAtAnswer1('new, 1, List('a, 'b, 'c, 'd)) should be (List('a, 'new, 'b, 'c, 'd))
  }

  it should "throw NoSuchElementException if minus n is gave" in {
    a [NoSuchElementException] should be thrownBy {
      insertAt('new, -1, List('a, 'b, 'c, 'd)) should be (List('a, 'new, 'b, 'c, 'd))
      insertAtAnswer1('new, -1, List('a, 'b, 'c, 'd)) should be (List('a, 'new, 'b, 'c, 'd))
    }
  }
}
