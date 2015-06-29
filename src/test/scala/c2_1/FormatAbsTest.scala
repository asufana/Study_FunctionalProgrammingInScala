package c2_1

import org.scalatest.{FunSuite, ShouldMatchers}

class FormatAbsTest extends FunSuite with ShouldMatchers {

    test ("FormatAbs.formatAbs") {
        println (FormatAbs.formatAbs (-42))
    }

}
