object StringPermutationKata {

  def permutation(text: String): List[String] = {
    text match {
      case text if text.isEmpty => List()
      case text => text.permutations.toList
    }
  }
}
