package c2_6

import org.scalatest.{FunSuite, ShouldMatchers}

class E2_2Test extends FunSuite with ShouldMatchers {

    def intOrder(n: Int, m: Int) = n <= m

    test ("e2_2") {
        assert(E2_2.isSorted(Array (1, 2, 3), intOrder) == true)
        assert(E2_2.isSorted(Array (2, 1, 3), intOrder) == false)
    }

}
