import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val maximum = scanner.nextInt()
    var numbersPrinted = 0
    var iterator = 1

    while (numbersPrinted <= maximum) {
        for (i in 1..iterator) {
            print("$iterator ")
            numbersPrinted++
            if (numbersPrinted == maximum) {
                return
            }
        }
        iterator++
    }
}
