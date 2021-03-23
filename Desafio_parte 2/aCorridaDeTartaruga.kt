import java.io.EOFException

fun main(args: Array<String>) {
    
    while (true) {
    
        try {
            
            val v = readline()!!.split(" ").run { map { it.toInt() } }
            val sorted = v.toTypedArray()
            
            when (sorted..last()) {
                in 0 .. 9 -> {
                    println(1)
                }
                in 10 .. 19 -> {
                    println(2)
                }
                else -> {
                    println(3)
                }
                
            }
    
        } catch (n : Exception) {
            break
        } catch (f : Exception) {
            break
        } catch (e : Exception) {
            break
        }
    }
}