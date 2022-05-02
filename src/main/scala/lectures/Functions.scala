package lectures

object Functions extends App{

  def aFunction(a: String, b: Int): String = {

    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParamterlessFunction(): Int = 42

  println(aParamterlessFunction())

  println(aParamterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n- 1)
  }

  println((aRepeatedFunction("hello", 3)))

  // when you need loops, use recursion

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int) : Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  def greeting(name: String, age: String): Unit = {
    println("Hi, my name is " + name + " and I am " + age + " years old.")
  }
  greeting("sally", "14")

  def findFactorial(num: Int) : Int = {
    if (num <= 0) 1
    else num * findFactorial(num - 1)
  }
  println(findFactorial(3))

  def findFibonacci(num: Int) : Int = {
    if (num <= 2) 1
    else findFibonacci(num -1) + findFibonacci(num-2)
  }
  println(findFibonacci(10))

  def isPrime(num: Int) : Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t<= 1) true
      else num % t != 0 && isPrimeUntil((t-1))
    }

    isPrimeUntil(num/2)
  }

  println(isPrime(4))

}
