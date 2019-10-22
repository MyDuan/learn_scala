package P20

object P20 {
  def removeAt[A](n: Int, ls: List[A]):(List[A], A) = {
    if (n < 0) throw new NoSuchElementException
    else (ls diff List(ls(n)), ls(n))
  }

  def removeAtAnswer1[A](n: Int, ls: List[A]): (List[A], A) = ls.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, e :: post)  => (pre ::: post, e)
    case (pre, Nil)        => throw new NoSuchElementException
  }
}
