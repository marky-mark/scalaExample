package simpletutorials

object Timer {

  /*  Could also use
    type Foo = () => Unit */

  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      //      Thread.sleep(1000)
      Thread sleep 1000
    }
  }

  def printTime() {
    println("printing....")
  }


  def main(args: Array[String]) {
    oncePerSecond(() => println("actually printing this.."))
    oncePerSecond(printTime)
  }
}
