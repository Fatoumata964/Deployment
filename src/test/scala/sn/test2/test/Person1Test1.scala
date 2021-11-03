package sn.test2.test

import sn.test2._
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
case class Person1Test1() extends FunSuite with BeforeAndAfter{
  var p: Person1 = _
  before {
    println("Pending Test")
    p = Person1(30, "shu")

  }
  test(testName = "TestGetId") {
  assert(p.getId(5) === 35)
  }
  test(testName = "TestGetName") {
    assert(p.getPrenom()==="shu")
  }
  after {
  println("Test End")
  }



}
