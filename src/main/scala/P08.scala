package P08

object P08 {
  def compress[A](ls: List[A]): List[A] = ls.foldRight(Nil: List[A]){ // Considering the order, use foldRight.
    (x, y) => if(y.isEmpty || y.head != x) x::y else y
  }
}
