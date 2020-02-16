package romannumerals

import romannumerals.RomanNumbers._

object RomanNumerals {
  val romanNumbers: List[RomanNumber] = List[RomanNumber](
    M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
  )
  var results: Map[Int, String] = Map[Int, String]()
  romanNumbers.foreach(rn => results += (rn.value -> rn.symbol))

  def convert(number: Int): String = {

    if (results.contains(number))
      return results(number)
    for (rn <- romanNumbers) {
      if (number > rn.value)
        return rn.symbol + convert(number - rn.value)
    }
    ""
  }

}
