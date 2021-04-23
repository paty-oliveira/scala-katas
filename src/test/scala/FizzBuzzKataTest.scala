import org.scalatest.funsuite.AnyFunSuite

class FizzBuzzKataTest extends AnyFunSuite{
  test("Should return fizz if the number is dividable by 3"){
    val outputResult = "fizz"

    var inputNumber = 3
    assert(FizzBuzzKata.getStatus(inputNumber) == outputResult)

    inputNumber = 6
    assert(FizzBuzzKata.getStatus(inputNumber) == outputResult)
  }

  test("Should return buzz if the number is dividable by 5"){
    val outputResult = "buzz"

    var inputNumber = 5
    assert(FizzBuzzKata.getStatus(inputNumber) == outputResult)

    inputNumber = 10
    assert(FizzBuzzKata.getStatus(inputNumber) == outputResult)
  }

  test("Should return fizzbuzz if the number is dividable by 15"){
    val outputResult = "fizzbuzz"

    var inputNumber = 15
    assert(FizzBuzzKata.getStatus(inputNumber) == outputResult)

    inputNumber = 30
    assert(FizzBuzzKata.getStatus(inputNumber) == outputResult)
  }

  test("Should return the same number if no other requirement is fulfilled"){
    var inputNumber = 1
    assert(FizzBuzzKata.getStatus(inputNumber) == inputNumber.toString)

    inputNumber = 2
    assert(FizzBuzzKata.getStatus(inputNumber) == inputNumber.toString)

    inputNumber = 4
    assert(FizzBuzzKata.getStatus(inputNumber) == inputNumber.toString)
  }
}
