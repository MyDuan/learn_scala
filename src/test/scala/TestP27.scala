package P27

import org.scalatest._

class TestP27 extends FlatSpec with Matchers {
  import P27._
  "group3 of P27" should "Generate a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons" in {
    group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    contain (List(List("Aldo", "Beat"), List("Carla", "David"), List("Evi", "Flip", "Gary", "Hugo", "Ida")))
  }


  "group of P27" should "Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups." in {
    group(List(2,3,4), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    contain (List(List("Aldo", "Beat"), List("Carla", "David"), List("Evi", "Flip", "Gary", "Hugo", "Ida")))
  }
}
