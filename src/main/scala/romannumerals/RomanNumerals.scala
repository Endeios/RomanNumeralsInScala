package romannumerals

object RomanNumerals {
  def convert(number: Int): String = {
    val result = new StringBuilder("I")
    if( number > 1){
       result ++="I"
    }
    if (number > 2){
      result ++= "I"
    }

    result.result()
  }

}
