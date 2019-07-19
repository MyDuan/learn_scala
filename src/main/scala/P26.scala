package P26

object P26 {

  def select_or_not[A](n: Int, sl: List[A],ls: List[A]): List[List[A]] =
    (n, ls) match {
      case (0, _)         => List(sl.reverse)
      case (_, Nil)       => Nil
      // select_or_not (n, sl, tail) means do not select, select_or_not (n - 1, h::sl, tail) means select this elements
      case (n, h :: tail) => select_or_not (n, sl, tail) ::: select_or_not (n - 1, h::sl, tail)
    }

  def combinations[A](n: Int, ls: List[A]): List[List[A]] =
    select_or_not(n, Nil, ls).reverse


  def getAllSublists[A,B](ls: List[A])(f: (List[A]) => List[B]): List[B] =
    ls match {
      case Nil => Nil
      case (_ :: tail) => f(ls):::getAllSublists(tail)(f)
    }


  def combinations2[A](n: Int, ls: List[A]): List[List[A]] =
    if (n == 0) List(Nil)
    else getAllSublists(ls) {
      sl =>combinations2(n - 1, sl.tail) map {sl.head :: _}
    }
}

