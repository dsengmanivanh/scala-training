package week1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
    test("pascal: col=0,row=2") {
      assert(First.pascal(0,2) === 1)
  }

    test("pascal: col=1,row=2") {
      assert(First.pascal(1,2) === 2)
  }

    test("pascal: col=1,row=3") {
      assert(First.pascal(1,3) === 3)
  }

}
