package P18

object P18 {
  def slice[A](start: Int, end: Int, ls: List[A]):List[A] = {
    ls.slice(start, end)
  }

  // Simple recursive.
  def sliceAnswer1[A](start: Int, end: Int, ls: List[A]): List[A] =
    (start, end, ls) match {
      case (_, _, Nil)                 => Nil
      case (_, e, _)         if e <= 0 => Nil
      case (s, e, h :: tail) if s <= 0 => h :: sliceAnswer1(0, e - 1, tail)
      case (s, e, h :: tail)           => sliceAnswer1(s - 1, e - 1, tail)
    }
}
