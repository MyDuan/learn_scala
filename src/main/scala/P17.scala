package P17

object P17 {
  def split[A](n: Int, ls: List[A]): (List[A], List[A]) = {
    ls.splitAt(n)
  }
}
