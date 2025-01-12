// 整数リストのすべての要素を2倍にする関数。
def mapList[T, E](numList: List[T], mapFunc: T => E): List[E] =
  numList.map(mapFunc)
// リスト内の偶数の要素のみをカウントする関数。
def countList[T](numList: List[T], filterFunc: T => Boolean): Int =
  numList.count(filterFunc)

// リスト内の最大値を計算する関数。
def getValue[T](numList: List[T], compareFunc: (T, T) => Boolean): T =
  numList.reduce((a, b) => if (compareFunc(a, b)) a else b)

@main def main(): Unit = {
  val numList = List(1, 2, 3, 4, 5)
  println(mapList[Int, Int](numList, n => n * 2))
  println(countList[Int](numList, n => n % 2 == 0))
  println(getValue[Int](numList, (a, b) => a > b))
}
