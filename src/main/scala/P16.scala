package P16

object P16 {
  def drop[A](n: Int, ls: List[A]): List[A] = {
    ls.zipWithIndex.collect {  // collect -> filter + map
      case (item, index) if ((index+1) % n != 0) => item
    }
  }
}
