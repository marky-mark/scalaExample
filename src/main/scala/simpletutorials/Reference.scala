package simpletutorials

//Genericity
class Reference[T] {
  //_ is default value
  private var contents: T = _
  def set(value: T) { contents = value }
  def get: T = contents
}