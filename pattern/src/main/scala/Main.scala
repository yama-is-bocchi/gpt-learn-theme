def getPatternMatch(target: String): String = {
  target match
    case "hello"=>"Hi there!"
    case "bye"=>"Goodbye!"
    case _ => target.toIntOption match
      case Some(value)=> (value * 2).toString()
      case None  => "Unknown input"
}

@main def main(): Unit = {
  println(getPatternMatch("hello"))
  println(getPatternMatch("bye"))
  println(getPatternMatch("100"))
  println(getPatternMatch("how are you?"))
}
