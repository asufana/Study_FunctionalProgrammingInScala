package c1_1

import org.scalatest.{FunSuite, ShouldMatchers}

class CafeTest extends FunSuite with ShouldMatchers {
    test ("CafeTest.buyCoffee") {
        val (coffee, charge) = new Cafe ().buyCoffee (new CreditCard)
        assert (coffee != null)
        assert (charge != null)
        assert (charge.amount == new Coffee().price)
    }

    test ("CafeTest.buyCoffees") {
        val numOfCoffees = 10
        val (coffees, charge) = new Cafe ().buyCoffees (new CreditCard, numOfCoffees)
        assert (coffees != null)
        assert (charge != null)
        assert (charge.amount == new Coffee().price * numOfCoffees)
    }

}
