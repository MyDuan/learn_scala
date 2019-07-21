package P05

object P05 {
  def reverse[A](ls:List[A]): List[A] = ls.reverse

  def reverseAnswer1[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseAnswer1(tail) ::: List(h)
  }

  def reverseAnswer2[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (r, h) => h :: r }
}
