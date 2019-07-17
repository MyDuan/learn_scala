package P25

import P23.P23

object P25 {
  def randomPermute[A](ls: List[A]): List[A] = {
    P23.randomSelect(ls.length, ls)
  }
}
