import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    for (i in 1..4) {
        val character = scanner.next().first().toInt()
        if (i != 4) {
            if (character in 48..57) {
                print("true\\")
            } else {
                print("false\\")
            }
        } else {
            if (character in 48..57) {
                print("true")
            } else {
                print("false")
            }
        }
    }
}
