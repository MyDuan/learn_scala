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

  def rotateAnswer1[A](n: Int, ls: List[A]): List[A] = {
    val nBounded = if (ls.isEmpty) 0 else n % ls.length
    if (nBounded < 0) rotate(nBounded + ls.length, ls)
    else (ls drop nBounded) ::: (ls take nBounded)
  }
}
