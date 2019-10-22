package P22

object P22 {
  def range(n: Int, m: Int) : List[Int] = {
    if (n > m) Nil
    else (n to m).toList
  }

  def rangeBuiltin(start: Int, end: Int): List[Int] = List.range(start, end + 1)

  def rangeRecursive(start: Int, end: Int): List[Int] =
    if (end < start) Nil
    else start :: rangeRecursive(start + 1, end)

  def rangeTailRecursive(start: Int, end: Int): List[Int] = {
    def rangeR(end: Int, result: List[Int]): List[Int] = {
      if (end < start) result
      else rangeR(end - 1, end :: result)
    }
    rangeR(end, Nil)
  }
}
