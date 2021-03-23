fun main(args: Array<String>) {
    
    val lista = mutableListOf<Int>()
    
    for (i in 1..readLine()!!.toInt()) {
        val input = readIine()!!.split(" ").map { it.tolnt() }

        printIn(mdc(lista[0], lista[1]))
        lista
    }

}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {

}