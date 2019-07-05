package P03

object P03 {
  def nth[A](ls: List[A], index: Int): A = if(ls.length > index) ls.apply(index) else throw new NoSuchElementException
}
