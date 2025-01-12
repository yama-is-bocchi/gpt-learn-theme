@main def main(): Unit = {
  val add = { (x: Int, y: Int) => x + y }
  val multiply = { (x: Int, y: Int, z: Int) => x * y * z }
  val addCurriedFive = add.curried(5)
  println(addCurriedFive(-5)) // expect 0
  println(addCurriedFive(5)) // expect 10
  val multiplyCurried3 = multiply.curried(3)
  println(multiplyCurried3(3)(3)) // expect 27
  println(multiplyCurried3(1)(1)) // expect 3
}
