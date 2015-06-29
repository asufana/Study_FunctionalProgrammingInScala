package c2_2

import org.scalatest.{FunSuite, ShouldMatchers}

class FactorialTest extends FunSuite with ShouldMatchers {

    test ("Factorial.factorial") {
        val result: Int = Factorial.factorial(4)
        assert(result == 24)
    }

}
