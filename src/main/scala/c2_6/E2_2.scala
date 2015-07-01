package c2_6

object E2_2 {

    def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        def go(n: Int): Boolean =
            if (as.length <= n + 1) true
            else if (! ordered (as (n), as (n + 1))) false
            else go (n + 1)
        go (0)
    }

}
