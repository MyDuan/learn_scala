package P06

import org.scalatest._

class TestP06 extends FlatSpec with Matchers {
  import P06._

  "isPalindrome of P06" should "check whether a list is palindrome" in {
    isPalindrome(List(1,2,3,2,1)) should be (true)
    isPalindrome(List(1,3,2)) should be (false)
    isPalindrome(List(1)) should be (true)
    isPalindrome(Nil:List[Int]) should be (true)
  }
}

