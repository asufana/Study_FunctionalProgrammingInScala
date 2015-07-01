package c2_6

import org.scalatest.{FunSuite, ShouldMatchers}

class C2_6Test extends FunSuite with ShouldMatchers {

    def filterByLength(s:String): Boolean = s.length() > 2

    test("c2_6"){
        assert(C2_6.findFirst[String](Array("a","bb","ccc"),  filterByLength) == 2)

        assert(C2_6.findFirst[String](Array("a","bb","ccc"),  s => s.length() > 2) == 2)
    }

}
