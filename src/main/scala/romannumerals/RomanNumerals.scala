package romannumerals

object RomanNumerals {
  def convert(number: Int): String = {
    val results: Array[String] = Array("I", "II", "III", "IV")
    results(number - 1)
  }

}
