package lectures

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
//      println("Computing factorial of " + n + " - First need factorial of " + (n-1))
      val result = n * factorial(n-1)
//      println("Computed factorial of " + n )

      result
    }
//    println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x<= 1)accumulator
      else factHelper(x-1, x* accumulator)
    factHelper(n, 1)
  }
  println(anotherFactorial(100))

  @tailrec
  def concateString(n: Int, s: String, accumulator: String): String = {
    if(n<= 0) accumulator
    else concateString(n-1, s, accumulator + s)

  }
  println(concateString(3, "hello", ""))


  def isPrime(n:Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailrec(t -1, n % t != 0 && isStillPrime)


    }
    isPrimeTailrec(n/2, true)
  }
  println(isPrime(6))
  println(isPrime(7))

  def fibonacci (n:Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int ): Int =
      if (i >= n) last
      else fiboTailrec(i+1, last + nextToLast, last)

    if ( n<= 2) 1
    else fiboTailrec(2,1,1)
  }
  println(fibonacci(8))

}
