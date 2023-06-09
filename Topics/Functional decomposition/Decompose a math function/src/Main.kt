import kotlin.math.pow

fun f(x: Double): Double = when {
    x <= 0 -> f1(x)
    x >= 1 -> f3(x)
    else -> f2(x)
}

// implement your functions here
fun f1(x: Double) = x.pow(2) + 1

fun f2(x: Double) = 1 / x.pow(2)

fun f3(x: Double) = x.pow(2) - 1