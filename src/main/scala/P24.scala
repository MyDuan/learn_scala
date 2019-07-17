package P24

object P24 {
  def lotto(n: Int, max: Int): List[Int] = {
    if (n <=0 ) Nil
    else {
      val e = util.Random.nextInt(max)
      e :: lotto(n - 1, max)
    }
  }
}
