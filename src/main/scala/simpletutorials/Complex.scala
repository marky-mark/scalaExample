package simpletutorials

class Complex(real: Double, imaginary: Double) {

  //can also be defined without parenthesis
  def re() = real
  def im() = imaginary

  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}
