package P09

import org.scalatest._

class TestP09 extends FlatSpec with Matchers {
  import P09._

  "pack of P09" should "pack a list" in {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be
      (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
    pack(List()) should be (List(List()))
  }
}