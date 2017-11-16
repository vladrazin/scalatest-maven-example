package trademore.testsuite.common

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Seconds, Span}
import org.scalatest.{FlatSpec, FunSuite, Matchers}


abstract class FunctionalSpec extends FlatSpec with Matchers with ScalaFutures  {
  override implicit val patienceConfig = PatienceConfig(timeout = Span(60,Seconds), interval = Span(3, Seconds))
}
