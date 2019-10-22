package P22

import org.scalatest._

class TestP22 extends FlatSpec with Matchers {
  import P22._

  "range of P22" should "Create a list containing all integers within a given range." in {
    range(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    range(10, 9) should be (Nil)
    rangeBuiltin(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    rangeRecursive(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    rangeTailRecursive(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    rangeBuiltin(10, 9) should be (Nil)
    rangeRecursive(10, 9) should be (Nil)
    rangeTailRecursive(10, 9) should be (Nil)
  }

}
