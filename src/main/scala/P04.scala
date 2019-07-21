package P04

object P04 {
  def len[A](ls: List[A]): Int = ls.length

  def lenAnswer1[A](ls: List[A]): Int = ls match {
    case Nil       => 0
    case _ :: tail => 1 + lenAnswer1(tail)
  }

  def lenAnswer2[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }
}
