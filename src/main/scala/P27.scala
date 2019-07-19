package P27
import P26.P26.combinations

object P27 {

  def group3[A](ls: List[A]): List[Any] = {
    for (first <- combinations(2, ls);sec <- combinations(3, ls diff first))
      yield List(first, sec, ls diff first diff sec)
  }

  def group[A](group_num: List[Int], ls: List[A]): List[Any] = {
    group_num match {
      case Nil => List(Nil)
      case (n::others) => for (first <- combinations(n, ls);sec <- combinations(others.head, ls diff first)) yield List(first, sec, ls diff first diff sec)
    }
  }
}
