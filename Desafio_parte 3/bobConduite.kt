import java.util.Scanner

fun main(args:Array<String>) {
    val scanner = Scanner(System.'in')
    val T = scanner.nextlnt()
    var N1: Int
    var N2: Int
    
    for (i in 0 until T) {
        N1 = scanner.nextlnt()
        N2 = scanner.nextlnt()
        println(N1 + N2)
    }
}