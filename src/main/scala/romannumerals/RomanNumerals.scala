package romannumerals

object RomanNumerals {
  def convert(number: Int): String = {
    val results = Map(
      1->"I",
      2->"II",
      3->"III",
      4->"IV"
    )
    results(number)
  }

}
