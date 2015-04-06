package simpletutorials

object ExecuteWithAndReturn {

  def printString(foo: String): Int = {
    println("printing...." + foo)
    1
  }

  def executeWithStringAndReturn(callback: (String) => Int, foo: String): Int = {
    callback(foo)
  }

  def main(args: Array[String]) {

    //val is a immutable tpye, var isn't
    val returnedValue: Int = executeWithStringAndReturn(
      callback = (foo: String) => {
        println("nah i think..." + foo)
        1
      }, foo = "bar")

    println("returned value is " + returnedValue)

    //Also you can do
//    returnedValue = executeWithStringAndReturn(printString, "bar")
  }
}
