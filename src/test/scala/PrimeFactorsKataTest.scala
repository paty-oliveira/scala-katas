import org.scalatest.funsuite.AnyFunSuite

class PrimeFactorsKataTest extends AnyFunSuite{

  test("Should be a empty list for 1"){
    val inputNumber = 1
    val expectedResult = List()

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should be a List(2) for 2"){
    val inputNumber = 2
    val expectedResult = List(2)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should be a List(3) for 3"){
    val inputNumber = 3
    val expectedResult = List(3)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should be a List(2, 3) for 6"){
    val inputNumber = 6
    val expectedResult = List(2, 3)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should be a List(7) for 7"){
    val inputNumber = 7
    val expectedResult = List(7)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should be a List(2, 2, 2) for 8"){
    val inputNumber = 8
    val expectedResult = List(2, 2, 2)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should return a List(3, 23) for 69"){
    val inputNumber = 69
    val expectedResult = List(3, 23)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }

  test("Should return a List(2, 3, 29) for 174"){
    val inputNumber = 174
    val expectedResult = List(2, 3, 29)

    assert(PrimeFactorsKata.primeFactors(inputNumber) == expectedResult)
  }
}
