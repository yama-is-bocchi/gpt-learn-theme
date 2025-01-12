trait Animal {
  def speak(): String
}

trait HasTail {
  def tailLength(): String
}

class Dog extends Animal with HasTail {
  def speak(): String = "Woof!"
  def tailLength(): String = "Has a tail of 5cm"
}
class Cat extends Animal with HasTail {
  def speak(): String = "Meow!"
  def tailLength(): String = "Has a tail of 10cm"
}

def getHasTailAnimalInformation(animal: Animal & HasTail): String = {
  s"This animal's speak is ${animal.speak()}, ${animal.tailLength()}"
}

@main def main(): Unit = {
  // *** Dogの情報 ***
  println(getHasTailAnimalInformation(new Dog()))
  // *** Catの情報 ***
  println(getHasTailAnimalInformation(new Cat()))
}
