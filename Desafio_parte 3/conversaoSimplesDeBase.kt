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
        if (e.contains(r)) {
            hexaToDecimaI(s) 
        } else {
            decimaIToHexa(s)
    	}
	}
}

fun decimalToHexa(s: String) {
    val n = s.toInt()
    printIn("0x${Integer.toHexString(n).toUpperCase()}")
}