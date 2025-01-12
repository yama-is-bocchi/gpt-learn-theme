@main def main(): Unit = {
  // *** リスト操作 ***
  // 任意の整数のリストを作成。
  val numList = List(1, 2, 3, 4, 5)
  // 各要素を2倍にする新しいリストを生成。
  println(numList.flatMap[Int](num => List(num * 2)))
  // 偶数のみをフィルタリングしたリストを生成。
  println(numList.filter(num => num % 2 == 0))
  // リストのすべての要素の合計を計算。
  println(numList.sum)

}
