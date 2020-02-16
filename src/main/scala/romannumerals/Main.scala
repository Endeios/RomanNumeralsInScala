package romannumerals

import scala.util.Try

object Main extends App {

  val USAGE =
    s"""
       | This app return the roman numeral for an arabic numeral
       | Usage : romannumerals <number 1-3999>
       |""".stripMargin

  if (args.length == 0)
    Console.println(USAGE)
  val number = Try(args(0).toInt).toOption
  number match {
    case Some(value) =>
      if (value > 0 && value < 4000)
        Console.println(RomanNumerals.convert(value))
      else Console.print("Only numbers between 1 and 3999 are supported.\n")
    case None => Console.println(USAGE)
  }
}
