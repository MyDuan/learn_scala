package P20

object P20 {
  def removeAt[A](n: Int, ls: List[A]):(List[A], A) = {
    if (n < 0) throw new NoSuchElementException
    else (ls diff List(ls(n)), ls(n))
  }
}
