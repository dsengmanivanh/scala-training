package week1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  test("countChange: example given in instructions") {
    assert(First.countChange(4,List(1,2)) === 3)
  }

  test("countChange: sorted CHF") {
    assert(First.countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("countChange: no pennies") {
    assert(First.countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("countChange: unsorted CHF") {
    assert(First.countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }

}
