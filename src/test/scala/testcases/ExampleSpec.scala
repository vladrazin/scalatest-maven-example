package trademore.testsuite.testcases

import org.scalatest.refspec.RefSpec
import org.scalatest.{FeatureSpec, GivenWhenThen}
import trademore.testsuite.common._

//FlatSpec
/*
A good first step for teams wishing to move from xUnit to BDD, FlatSpec's structure is flat like xUnit, so simple and
familiar, but the test names must be written in a specification style: "X should Y," "A must B," etc.
 */
class FlatSpec extends FunctionalSpec {

  "A test " should "return a list elements summary result" in {
    var sum = 0
    val stackA = List(1,2,3)
    val stackB = List(4,5,6)
    val stackC = stackA ::: stackB
    stackC.foreach(sum += _)
    println(s"\nResult is $sum\n")
    assert(sum === 21)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}

//FeatureSpec
/*
Trait FeatureSpec is primarily intended for acceptance testing, including facilitating the process of programmers
working alongside non-programmers to define the acceptance requirements.
 */
class TVSet {
  private var on: Boolean = false
  def isOn: Boolean = on
  def pressPowerButton() {
    on = !on
  }
}

class TVSetSpec extends FeatureSpec with GivenWhenThen {

  info("As a TV set owner")
  info("I want to be able to turn the TV on and off")
  info("So I can watch TV when I want")
  info("And save energy when I'm not watching TV")

  feature("TV power button") {
    scenario("User presses power button when TV is off") {

      Given("a TV set that is switched off")
      val tv = new TVSet
      assert(!tv.isOn)

      When("the power button is pressed")
      tv.pressPowerButton()

      Then("the TV should switch on")
      assert(tv.isOn)
    }

    scenario("User presses power button when TV is on") {

      Given("a TV set that is switched on")
      val tv = new TVSet
      tv.pressPowerButton()
      assert(tv.isOn)

      When("the power button is pressed")
      tv.pressPowerButton()

      Then("the TV should switch off")
      assert(!tv.isOn)
    }
  }
}

//RefSpec (JVM only)
/*
RefSpec allows you to define tests as methods, which saves one function literal per test compared to style classes
that represent tests as functions. Fewer function literals translates into faster compile times and fewer generated
class files, which can help minimize build times. As a result, using Spec can be a
good choice in large projects where build times are a concern as well as when generating large numbers of
tests programatically via static code generators.
 */
class SetSpec extends RefSpec {

  object `A Set` {
    object `when empty` {
      def `should have size 0` {
        assert(Set.empty.size == 0)
      }

      def `should produce NoSuchElementException when head is invoked` {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}