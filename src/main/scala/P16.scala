package P16

object P16 {
  def drop[A](n: Int, ls: List[A]): List[A] = {
    if (n == 1) ls.drop(1)
    else {
      ls.zipWithIndex.collect {  // collect -> filter + map
        case (item, index) if ((index+1) % n != 0) => item
      }
    }
  }

  def dropAnswer1[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, curList: List[A]): List[A] = (c, curList) match {
      case (_, Nil)       => Nil
      case (1, _ :: tail) => dropR(n, tail)
      case (_, h :: tail) => h :: dropR(c - 1, tail)
    }
    if (n == 1) ls.drop(1)
    else dropR(n, ls)
  }

  def dropAnswer2[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, curList: List[A], result: List[A]): List[A] = (c, curList) match {
      case (_, Nil)       => result.reverse
      case (1, _ :: tail) => dropR(n, tail, result)
      case (_, h :: tail) => dropR(c - 1, tail, h :: result)
    }
    if (n == 1) ls.drop(1)
    else dropR(n, ls, Nil)
  }
}
