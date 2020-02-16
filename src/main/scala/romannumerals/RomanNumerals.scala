package romannumerals

object RomanNumerals {
  val results = Map(
    0 -> "",
    1 -> "I",
    4 -> "IV",
    5 -> "V",
    9 -> "IX",
    10 -> "X",
    40 -> "XL",
    50 -> "L",
    90 -> "XC",
    100 -> "C",
  )

  def convert(number: Int): String = {

    if (results.contains(number))
      return results(number)
    if (number > 90)
      return results(90) + convert(number - 90)
    if (number > 50)
      return results(50) + convert(number - 50)
    if (number > 40)
      return results(40) + convert(number - 40)
    if (number > 10)
      return results(10) + convert(number - 10)
    if (number > 5)
      return results(5) + convert(number - 5)
    results(1) + convert(number - 1)
  }

}
