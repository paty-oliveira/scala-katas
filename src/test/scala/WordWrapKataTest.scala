import org.scalatest.funsuite.AnyFunSuite

class WordWrapKataTest extends AnyFunSuite{

  test("Should return an empty string when no text is specified"){
    val inputText = ""
    val expectedResult = ""

    assert(WordWrapKata.StringImprovements(inputText).wordWrap(0) == expectedResult)
  }

  test("Should return a single word"){
    val inputText = "kata"
    val expectedResult = "kata"

    assert(WordWrapKata.StringImprovements(inputText).wordWrap(4) == expectedResult)
  }

  test("Should return wrapped text with small sample"){
    val inputText = "This kata"
    val expectedResult = "Thisnkata"

    assert(WordWrapKata.StringImprovements(inputText).wordWrap(4) == expectedResult)
  }

  test("Should return a wrapped text with a big sample"){
    val inputText = "This kata should be easy unless there are hidden, or not so hidden, obstacles. Let's start!"
    val expectedResult = "This katanshould beneasy unlessnthere arenhidden, ornnot sonhidden,nobstacles.nLet's start!"

    assert(WordWrapKata.StringImprovements(inputText).wordWrap(12) == expectedResult)
  }
}
