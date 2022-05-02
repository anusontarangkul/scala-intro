package lectures

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10,1)

  def savePicture(format: String = "spg", width: Int, height: Int): Unit = println("saving picture")
  savePicture(width= 800, height = 600)
}
