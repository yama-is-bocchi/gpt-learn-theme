sealed trait Shape {
  def area: Double
}

case class Circle(radius: Double) extends Shape {
  override def area: Double = radius * radius * math.Pi
}

case class Rectangle(width: Double, height: Double) extends Shape {
  override def area: Double = width * height
}

def calcShapeListArea(shapeList: List[Shape]): Double = {
  shapeList.map(shape => shape.area).sum
}

@main def main(): Unit = {
  val shapeList = List[Shape](Circle(5), Rectangle(10, 10), Circle(1))
  println(calcShapeListArea(shapeList))
}
