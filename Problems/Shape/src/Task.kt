import java.util.*

    fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val shape = scanner.nextInt()

    print(
            when (shape) {
                1 -> "You have chosen a square"
                2 -> "You have chosen a circle"
                3 -> "You have chosen a triangle"
                4 -> "You have chosen a rhombus"
                else -> "There is no such shape!"
            }
    )
}