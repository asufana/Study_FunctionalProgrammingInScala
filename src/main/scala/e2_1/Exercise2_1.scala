package e2_1

object Exercise2_1 {

    def fib(n: Int): Int =
        if (n < 2) n
        else fib (n - 1) + fib (n - 2)

}
