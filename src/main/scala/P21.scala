package P21

object P21 {
  def insertAt[A](e: A, n: Int, ls: List[A]):List[A] = {
    if (n < 0) throw new NoSuchElementException
    else {
      val (front, back) = ls.splitAt(n)
      front ++ (e :: back)
    }
  }

  def insertAtAnswer1[A](e: A, n: Int, ls: List[A]): List[A] = ls.splitAt(n) match {
    case (pre, post) => pre ::: e :: post
  }
}
