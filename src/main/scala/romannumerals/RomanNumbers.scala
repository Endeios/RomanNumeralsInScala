package romannumerals

case class RomanNumber(value: Int, symbol: String)

object RomanNumbers{
  val I  = RomanNumber(1,"I")
  val IV = RomanNumber(4,"IV")
  val V  = RomanNumber(5,"V")
  val IX = RomanNumber(9,"IX")
  val X  = RomanNumber(10,"X")
  val XL = RomanNumber(40,"XL")
  val L  = RomanNumber(50,"L")
  val XC = RomanNumber(90,"XC")
  val C  = RomanNumber(100,"C")
  val CD = RomanNumber(400,"CD")
  val D  = RomanNumber(500,"D")
  val CM = RomanNumber(900,"CM")
  val M  = RomanNumber(1000,"M")
}

