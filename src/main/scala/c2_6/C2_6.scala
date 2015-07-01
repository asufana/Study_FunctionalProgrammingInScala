package c2_6

object C2_6 {
    def findFirst[A](as: Array[A], p: A => Boolean): Int = {
        def loop(n: Int): Int =
            if (n >= as.length) -1
            else if (p (as (n))) n
            else loop (n + 1)

        loop(0)
    }

    def filterByString(s: String): Boolean =
        s.length() > 3

}
