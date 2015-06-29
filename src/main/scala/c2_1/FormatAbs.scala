package c2_1

object FormatAbs {

    def formatAbs(x: Int) = {
        val msg = "The absolute value of %d is %d"
        msg.format (x, abs (x))
    }

    private def abs(n: Int): Int =
        if (n < 0) -n
        else n

}
