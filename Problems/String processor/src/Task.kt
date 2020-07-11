import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstString = scanner.next()
    val operator = scanner.next()
    val secondString = scanner.next()

    val result = when (operator) {
        "equals" -> firstString == secondString
        "plus" -> firstString + secondString
        "endsWith" -> firstString.endsWith(secondString)
        else -> "Unknown operation"
    }

    print(result)
}