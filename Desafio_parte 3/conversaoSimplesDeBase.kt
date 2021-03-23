fun main(args: Array<String>) {
	
	var s : String
	var n : Int
	val r = """0x.*""".toRegex()
	while(true) {
		
        val v = readLine()!!
        try {
            val value = v.toInt()
            if (value == -1) { break } 
        } catch (e: Exception) {}
        if (v.contains(r)) {
            hexaToDecimal(s) 
        } else {
            decimalToHexa(s)
    	}
	}
}

fun decimalToHexa(s: String) {
    val n = s.toInt()
    println("0x${Integer.toHexString(n).toUpperCase()}")
}

fun hexaToDecimal(s: String) {
    val hex = s.subSequence(2, s.length).toString()
    val n = Integer.parseInt(hex, 16)
    println(n)
}