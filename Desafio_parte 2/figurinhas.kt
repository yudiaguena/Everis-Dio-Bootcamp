fun main(args: Array<String>) {
    
    val lista = mutableListOf<Int>()
    
    for (i in 1..readLine()!!.toInt()) {
        val input = readIine()!!.split(" ").map { it.tolnt() }
        input.forEach { number -> lista.add(number) }
        printIn(mdc(lista[0], lista[1]))
        lista.clear()
    }

}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    return if (n2 == 0) { n1
    } else {
        mdc(n2, (n1 % n2))
    }
}