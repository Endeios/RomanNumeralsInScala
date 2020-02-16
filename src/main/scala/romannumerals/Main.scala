package romannumerals

import scala.util.Try

object Main extends App {

  val USAGE =
    s"""
       | This app return the roman numeral for an arabic numeral
       | Usage :
       |      romannumerals <number 1-3999>           converts a number to roman
       |      romannumerals                           prints on console the supported roman numbers
       |""".stripMargin

  def prettyPrintAllNumbers(): Unit = {
    val supportedNumbers = List.range(1, 4000)
    Console.println(s"| Arabic | Roman         |")
    Console.println(s"|--------|---------------|")
      supportedNumbers.foreach(
      n=> Console.println(f"|$n%8d|${RomanNumerals.convert(n)}%15s|")
    )
  }

  if (args.length == 0)
    prettyPrintAllNumbers()
  val number = Try(args(0).toInt).toOption
  number match {
    case Some(value) =>
      if (value > 0 && value < 4000)
        Console.println(RomanNumerals.convert(value))
      else Console.print("Only numbers between 1 and 3999 are supported.\n")
    case None => Console.println(USAGE)
  }
}
