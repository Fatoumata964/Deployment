package sn.test2.test

import sn.test2._
import org.scalatest.{ FlatSpec, Matchers, BeforeAndAfter}
class Person1Test extends FlatSpec with Matchers with BeforeAndAfter {
  var p:Person1 = _
  before {
    println("Pending Test")
    p = Person1(78, "badji")
  }
  "test getId" should "test getIdA" in {
    p.getId(10) should equal(88)
  }
  "test getPrenom" should "test getName" in {
    p.getPrenom() should equal("Diagne")
  }
  after {
  println("TestEnd")
  }
}