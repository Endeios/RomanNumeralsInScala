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
    (5,"V"),
    (6,"VI"),
    (7,"VII"),
    (8,"VIII"),
    (9,"IX"),
    (10,"X"),
    (11,"XI"),
    (12,"XII"),
    (13,"XIII"),
    (14,"XIV"),
    (15,"XV"),
    (19,"XIX"),
    (20,"XX"),
    (24,"XXIV"),
    (29,"XXIX"),
    (30,"XXX"),
    (34,"XXXIV"),
    (39,"XXXIX"),
    (40,"XL"),
    (44,"XLIV"),
    (49,"XLIX"),
    (50,"L"),
    (54,"LIV"),
    (59,"LIX"),
    (60,"LX"),
    (70,"LXX"),
    (80,"LXXX"),
    (90,"XC"),
    (99,"XCIX"),
   (100,"C"),
  ).map(t=>Case(t._1,t._2))

  cases.foreach(useCase=>{
    it should s"transform ${useCase.arabic}  into ${useCase.roman}" in {
      RomanNumerals.convert(useCase.arabic) shouldBe useCase.roman
    }
  })


}
