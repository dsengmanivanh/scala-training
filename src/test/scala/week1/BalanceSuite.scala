package week1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BalanceSuite extends FunSuite {
  test("balance: '(if (zero? x) max (/ 1 x))' is balanced") {
    assert(First.balance("(if (zero? x) max (/ 1 x))".toList))
  }

  test("balance: 'I told him ...' is balanced") {
    assert(First.balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
  }

  test("balance: ':-)' is unbalanced") {
    assert(!First.balance(":-)".toList))
  }

  test("balance: counting is not enough") {
    assert(!First.balance("())(".toList))
  }

}
