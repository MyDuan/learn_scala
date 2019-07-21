package P17

object P17 {
  def split[A](n: Int, ls: List[A]): (List[A], List[A]) = {
    ls.splitAt(n)
  }

  def splitAnswer1[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
    case (_, Nil)       => (Nil, Nil)
    case (0, list)      => (Nil, list)
    case (n, h :: tail) => {
      val (pre, post) = splitAnswer1(n - 1, tail)
      (h :: pre, post)
    }
  }

  // Tail recursive.
  def splitAnswer2[A](n: Int, ls: List[A]): (List[A], List[A]) = {
    def splitR(curN: Int, curL: List[A], pre: List[A]): (List[A], List[A]) =
      (curN, curL) match {
        case (_, Nil)       => (pre.reverse, Nil)
        case (0, list)      => (pre.reverse, list)
        case (n, h :: tail) => splitR(n - 1, tail, h :: pre)
      }
    splitR(n, ls, Nil)
  }
}
