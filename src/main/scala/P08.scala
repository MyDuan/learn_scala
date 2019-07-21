package P08

object P08 {
  def compress[A](ls: List[A]): List[A] = ls.foldRight(Nil: List[A]){ // Considering the order, use foldRight.
    (x, y) => if(y.isEmpty || y.head != x) x::y else y
  }

  def compressAnswer1[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => h :: compressAnswer1(tail.dropWhile(_ == h))
  }

  def compressAnswer2[A](ls: List[A]): List[A] = {
    def compressR(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
      case Nil       => result.reverse
    }
    compressR(Nil, ls)
  }
}
