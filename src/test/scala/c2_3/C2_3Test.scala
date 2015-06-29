package c2_3


import org.scalatest.{FunSuite, ShouldMatchers}

class C2_3Test extends FunSuite with ShouldMatchers {

    test("c2_3"){
        println(C2_3.formatResult("absolute value", -42, C2_3.abs))
        println(C2_3.formatResult("factorial", 4, C2_3.factorial))
    }

}
