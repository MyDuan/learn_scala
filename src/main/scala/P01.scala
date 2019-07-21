package P01

object P01 {
  def last[A](ls: List[A]): A = ls.last

  def lastAnswer[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _::tail => lastAnswer(tail)
    case Nil => throw new NoSuchElementException
  }
}
