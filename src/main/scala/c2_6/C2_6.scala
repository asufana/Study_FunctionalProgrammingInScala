package c2_6

object C2_6 {
    def findFirst[A](as: Array[A], filter: A => Boolean): Int = {

        def go(n: Int): Int =
            if (n >= as.length) -1
            else if (filter(as(n))) n
            else go (n + 1)
        go(0)
    }

}
