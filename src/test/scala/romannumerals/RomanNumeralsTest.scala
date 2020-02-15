package romannumerals

import org.scalatest._
import org.scalatest.matchers.should.Matchers

abstract class UnitTest extends FlatSpec with Matchers

class RomanNumeralsTest extends UnitTest{

  "Roman numerals" should "exists" in {
    assert (RomanNumerals != null)
  }

  case class Case(arabic: Int, roman: String)

  val cases: List[Case] = List(
    (1,"I"),
    (2,"II"),
    (3,"III"),
    (4,"IV"),
  ).map(t=>Case(t._1,t._2))

  cases.foreach(useCase=>{
    it should s"transform ${useCase.arabic}  into ${useCase.roman}" in {
      RomanNumerals.convert(useCase.arabic) shouldBe useCase.roman
    }
  })


}
