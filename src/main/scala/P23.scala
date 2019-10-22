package P23
import P20.P20

object P23 {
  def randomSelect[A](n: Int, ls: List[A]) : List[A] = {
    if(n<=0) Nil
    else {
      val (removed_list, e) = (P20.removeAt(util.Random.nextInt(ls.length), ls))
      e::randomSelect(n-1, removed_list)
    }
  }

  def randomSelectAnswer1[A](n: Int, ls: List[A]): List[A] = {
    def randomSelectR(n: Int, ls: List[A], r: util.Random): List[A] =
      if (n <= 0) Nil
      else {
        val (rest, e) = P20.removeAt(r.nextInt(ls.length), ls)
        e :: randomSelectR(n - 1, rest, r)
      }
    randomSelectR(n, ls, new util.Random)
  }
}
