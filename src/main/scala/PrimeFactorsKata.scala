object PrimeFactorsKata {

  def primeFactors(number: Int): List[Int] = {
    if (number <= 1) return List()

    def foo(number: Int, i: Int): List[Int] =
      if (i * i > number) List(number)
      else
        number % i match {
          case 0 => i :: foo(number / i, i)
          case _ => foo(number, i + 1)
        }

    foo(number, 2)
  }
}
