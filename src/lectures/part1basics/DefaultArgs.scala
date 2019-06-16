package lectures.part1basics

object DefaultArgs extends App {

  def trFactorial(n: Int, acc: Int = 1): Int =
    if(n<=1) acc
    else trFactorial(n-1, n * acc)

  // default value of acc = 1, so if we dont pass it will be 1
  trFactorial(10)

  def savePicture(format: String = "jpeg", width: Int = 1980, height: Int = 1080): Unit = println("saving")
  // specify name of argument
  savePicture(width = 200)
  // u can pass args in diff order if u specify name of arg

}
