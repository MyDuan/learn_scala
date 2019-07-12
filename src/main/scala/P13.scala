package P13

object P13 {
    def encodeDirect[A](ls: List[A]): List[Any] = {
      if (ls.isEmpty) List()
      else {
        val (packed, unpacked) = ls span (n => n == ls.head)
        if (unpacked.isEmpty) List((packed.size, packed.head))
        else List((packed.size, packed.head)) :: encodeDirect(unpacked)
      }
    }
}
