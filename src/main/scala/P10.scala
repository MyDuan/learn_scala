package P10
import P09.P09

object P10 {
  def encode[A](ls: List[A]): List[Any] = {
    val packed = P09.pack(ls)
    if (packed == List(List())) List()
    else packed.map(ms => List((ms.size, ms.head)))
  }
}
