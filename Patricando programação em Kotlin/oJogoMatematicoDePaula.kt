fun main(args: Array<String>) {
    
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val ABC = 'A'..'Z'
        val abc = 'a'..'z'
        val line = readLine()!!

        for (letra in ABC) {
            if (line.contains(letra)) {
                val lista = line.split(letra).map { it.toInt() }
                val N1 = lista[0]
                val N2 = lista[1]
                
                if (N1 == N2) {
                    println(N2 * N1)
                } else {
                    println(N2 - N1)
                }
            }
        }
        for (letra in abc) {
            if (line.contains(letra)) {
                val lista = line.split(letra).map { it.toInt() }
                val N1 = lista[0]
                val N2 = lista[1]

                if (N1 == N2) {
                    println(N2 * N1)
                } else {
                    println(N2 + N1)
                }
            }
        // println(letra)
        }
    }
}