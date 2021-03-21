fun main(args: Array<String>) {
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0f

    var d: Float
    
	if (r > 4500f) {
        i = 1000 * 0.08f + 1500 * 0.18f
        d = r - 4500
        i += d*0.28f
        println("teste 4500 $i")
    } else if (r > 3000f) {
        i = 1000 * 0.08f
        d = r - 3000
        i += d*0.18f
        println("teste 3000 $i")
    } else if (r > 2000f) {
        d = r - 2000
        i = d*0.08f
        println("teste 2000 $i")
    }else if (r <= 2000f) {
        i = 0f
    } 
    if (i == 0f ) println("Isento") else println("R$ ${i.format(2)}")
    
}