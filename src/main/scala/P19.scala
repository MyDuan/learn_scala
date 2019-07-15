package P19

object P19 {
  def rotate[A](n: Int, ls: List[A]):List[A] = {
    var position = 0
    if(n >=0) {
      position = n
    }  else {
      position = n + ls.length
    }
    val (front, back) = ls.splitAt(position)
    back ++ front
  }
}
