package P02

object P02 {
  def penultimate[A](ls: List[A]): A = ls.init.last

  def penultimateAnswer[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail     => penultimateAnswer(tail)
    case _             => throw new NoSuchElementException
  }
}
