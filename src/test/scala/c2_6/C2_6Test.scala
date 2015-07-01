package c2_6

import org.scalatest.{FunSuite, ShouldMatchers}

class C2_6Test extends FunSuite with ShouldMatchers {

    test("c2_6"){
        val i: Int = C2_6.findFirst[String](Array("a","bb","ccc","dddd"), C2_6
            .filterByString)
        assert(i == 3)
    }

}
