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
        println("Prime")
    } else println("Not Prime")
}

fun isPrime(num: Float): Boolean {
    if (num < 2f) return false
    if (num % 2 == 0f) return num == 2f
    val root = sqrt(num).toInt()
    var i = 3
    while (i <= root) {
        if (num % i == 0f) return false
        i += 2
    }
    return true
}