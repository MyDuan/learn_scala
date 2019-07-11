package P09

object P09 {
  def pack[A](ls: List[A]): List[List[A]] = {
    val (packed, unpacked) = ls span(n => n == ls.head)
    if (unpacked.isEmpty) List(packed)
    else packed::pack(unpacked)
  }
}
