import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val string = scanner.nextLine()
    val n = scanner.nextInt()
    println("Symbol # $n of the string \"$string\" is '${string[n - 1]}'")
}