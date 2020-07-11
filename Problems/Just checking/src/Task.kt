import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    when (num) {
        1, 3, 4 -> print("No!")
        2 -> print("Yes!")
        else -> print("Unknown number")
    }
}