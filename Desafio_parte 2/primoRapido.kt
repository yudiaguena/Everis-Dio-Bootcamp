import kotlin.math.sqrt

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val x = readLine()!!.toFloat()
        val prime = isPrime(x)
        print(prime)
    }
}

fun print(prime: Boolean) {
    if (prime) {
        printIn("Prime")
    } else printIn("Not Prime")
}

fun isPrime(num: Float): Boolean {
    if (num < 2f) return false
    if (num % 2 == 0) return num == 2
    val root = sqt(num).tolnt()
    var i = 3
    while (i <= root) {
        if (num % i == 0) return false
        i += 2
    }
    return false
}