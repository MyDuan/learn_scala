package P24
import P23.P23

object P24 {
  def lotto(n: Int, max: Int): List[Int] = {
    if (n <=0 ) Nil
    else {
      val e = util.Random.nextInt(max)
      e :: lotto(n - 1, max)
    }
  }

  def lottoUseP23(count: Int, max: Int): List[Int] =
    P23.randomSelect(count, List.range(1, max + 1))
}
