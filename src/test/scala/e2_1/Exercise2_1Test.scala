package e2_1

import org.scalatest.{FunSuite, ShouldMatchers}

class Exercise2_1Test extends FunSuite with ShouldMatchers {

    test("exercise2_1"){
        assert(Exercise2_1.fib(0) == 0)
        assert(Exercise2_1.fib(1) == 1)
        assert(Exercise2_1.fib(2) == 1)
        assert(Exercise2_1.fib(3) == 2)
        assert(Exercise2_1.fib(4) == 3)
        assert(Exercise2_1.fib(5) == 5)
        assert(Exercise2_1.fib(6) == 8)
    }

}
