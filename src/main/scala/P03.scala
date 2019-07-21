package P03

object P03 {
  def nth[A](ls: List[A], index: Int): A = if(ls.length > index) ls.apply(index) else throw new NoSuchElementException

  def nthAnswer[A](ls: List[A], n: Int): A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthAnswer(tail, n - 1)
    case (_, Nil      ) => throw new NoSuchElementException
  }
}
