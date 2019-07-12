package P14

object P14 {
  def duplicate[A](ls: List[A]): List[A] = {
    ls.flatMap(n => List.fill(2)(n))
  }
}
