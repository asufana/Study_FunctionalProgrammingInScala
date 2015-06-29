package c2_3

object C2_3 {
    def abs(n: Int): Int =
        if (n < 0) -n
        else n

    def factorial(n: Int): Int = {
        def go(n: Int, acc: Int): Int =
            if (n <= 0) acc
            else go (n - 1, n * acc)

        go (n, 1)
    }

    def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s of %d is %d."
        msg.format (name, n, f (n))
    }

}
