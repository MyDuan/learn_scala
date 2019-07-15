package P22

object P22 {
  def range(n: Int, m: Int) : List[Int] = {
    if (n > m) Nil
    else (n to m).toList
  }
}
