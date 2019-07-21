package P16

import org.scalatest._

class TestP16 extends FlatSpec with Matchers {

  import P16._

  "drop of P16" should "drop the every nth elements in a list" in {
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    drop(1, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    drop(2, List()) should be(List())
    dropAnswer1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    dropAnswer1(1, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    dropAnswer1(2, List()) should be(List())
    dropAnswer2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    dropAnswer2(1, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be(List('b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    dropAnswer2(2, List()) should be(List())
  }
}