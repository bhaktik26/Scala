package lectures.part1basics

object Expressions extends App {

  val x = 1+2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>(right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable +=3 // also works with -= *= /= ... side effects
  println(aVariable)

  // Instructions(Do) vs Expressions(Value)
  // IF Expression
  val aCondition = true
  val aConditionedVal = if(aCondition) 5 else 3  // IF expression, it returns a value
  println(aConditionedVal)

  // while loop to print nos from 0 to 9
  var i = 0
  while(i < 10) {
    print(i + " ")
    i +=1
  }
  // NEVER WRITE THIS AGAIN !!!!!!
  // Everything in Scala is an expression

  val aWeirdValue = (aVariable = 3)   // Unit == void
  println(aWeirdValue)

  // side effects - println, while, reassigning
  // expression returning Unit ()

  // code blocks
  val aCodeBlock = {
    val x = 1
    val y = x + 1
    if(y > 2 ) "hi" else "bye"
  }



}
