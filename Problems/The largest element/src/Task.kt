import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var largest = 0
    do {
        val num = scanner.nextInt()
        if (num >= largest) {
            largest = num
        }
    }
    while (num != 0)
    print(largest)
}