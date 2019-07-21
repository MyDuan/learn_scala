package P28

object P28 {
  import P10.P10.encode
  def lsort[A](ls :List[List[A]]): List[List[A]] =
    ls sortWith (_.length > _.length)

  def lsortFreq[A](ls :List[List[A]]): List[List[A]] = {
    val sorted_ls = lsort(ls)
    val ls_length_freq = encode(sorted_ls.map(_.length)).map{ _.swap}
    val length_freq_map = Map(ls_length_freq:_*)
    ls sortWith { (e1, e2) => length_freq_map(e1.length) < length_freq_map(e2.length) }
  }
}
