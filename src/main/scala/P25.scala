package P25

import P23.P23

object P25 {
  def randomPermute[A](ls: List[A]): List[A] = {
    P23.randomSelect(ls.length, ls)
  }

  def randomPermuteAnswer1[A](ls: List[Any]): List[Any] = {
    val rand = new util.Random
    val a = ls.toArray
    for (i <- a.length - 1 to 1 by -1) {
      val i1 = rand.nextInt(i + 1)
      val t = a(i)
      a.update(i, a(i1))
      a.update(i1, t)
    }
    a.toList
  }

}
