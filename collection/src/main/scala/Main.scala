@main def main(): Unit = {
  // *** リスト操作 ***
  // 任意の整数のリストを作成。
  val numList = List(1, 2, 3, 4, 5)
  // 各要素を2倍にする新しいリストを生成。
  println(numList.map(num => num * 2))
  // 偶数のみをフィルタリングしたリストを生成。
  println(numList.filter(num => num % 2 == 0))
  // リストのすべての要素の合計を計算。
  println(numList.sum)
  // *** マップ操作 ***
  // 学生の名前と成績をマッピングするマップを作成（例: Map("Alice" -> 85, "Bob" -> 90)）。
  val students =
    Map("Alice" -> 85, "Bob" -> 90, "Charlotte" -> 95, "Daniel" -> 100)
  // すべての成績に+5点加算した新しいマップを生成。
  println(students.map(student => (student._1, student._2 + 5)))
  // 成績が90点以上の学生の名前をリストで取得。
  println(students.collect { case (name, score) if score >= 90 => name })
}
