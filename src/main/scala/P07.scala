package P07

object P07 {
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ls: List[Any] => flatten(ls)
    case e => List(e)
  }
}