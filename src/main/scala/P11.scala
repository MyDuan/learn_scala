package P11
import P09.P09

object P11 {
  def encodeModified[A](ls: List[A]): List[Any] = {
    val packed = P09.pack(ls)
    if (packed == List(List())) List()
    else packed.map(ms => {
      if (ms.size > 1) List((ms.size, ms.head))
      else List(ms.head)
    })
  }
}
