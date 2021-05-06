import org.scalatest.funsuite.AnyFunSuite

class StringPermutationKataTest extends AnyFunSuite{

  test("Should return an empty list when the input is empty"){
    val inputText = ""
    val expectedResult = List()

    assert(StringPermutationKata.permutation(inputText) == expectedResult)
  }

  test("The result has 6 permutations"){
    val inputText = "ABC"
    val expectedResult = 6

    StringPermutationKata.permutation(inputText).sizeCompare(expectedResult)
  }

  test("Should return a list with all permutations of ABC"){
    val inputText = "ABC"
    val expectedResult = List("ABC", "ACB", "BAC", "BCA", "CAB", "CBA")

    assert(StringPermutationKata.permutation(inputText) == expectedResult)
  }

  test("The result should contain permutation ACB"){
    var inputText = "ABC"
    val expectedResult = "ACB"
    StringPermutationKata.permutation(inputText) contains expectedResult

    inputText = "CBA"
    StringPermutationKata.permutation(inputText) contains expectedResult
  }

  test("The result should contain permutation BBYP"){
    val inputText = "PBYB"
    val expectedResult = "BBYP"
    StringPermutationKata.permutation(inputText) contains expectedResult
  }

  test("The result should contain permutation 0099"){
    val inputText = "0909"
    val expectedResult = "0099"
    StringPermutationKata.permutation(inputText) contains expectedResult
  }
}
