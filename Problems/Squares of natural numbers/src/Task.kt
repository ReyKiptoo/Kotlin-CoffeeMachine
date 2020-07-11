import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    var i = 1
    var number = 0
    while(number <= num) {
       number = i * i
        i++
        if (number <= num) {
            println(number)
        }
    }
}