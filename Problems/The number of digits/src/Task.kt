import java.util.*

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val length = scanner.nextInt().toString().length
        print( when (length) {
           1 -> "1"
           2 -> "2"
           3 -> "3"
           4 -> "4"
           else -> ""
        })
}