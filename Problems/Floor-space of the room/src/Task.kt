import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val shape = scanner.next()
    val area = when (shape) {
        "triangle" -> {
            val a = scanner.nextInt()
            val b = scanner.nextInt()
            val c = scanner.nextInt()
            val halfPerimeter = 0.5 * (a + b + c)
            val area = Math.sqrt(halfPerimeter * (halfPerimeter -a) * (halfPerimeter - b) * (halfPerimeter - c))
            area
        }
        "rectangle" -> {
            val a = scanner.nextInt()
            val b = scanner.nextInt()
            val area = a * b
            area
        }
        "circle" -> {
            val a = scanner.nextInt()
            val area = 3.14 * a * a
            area
        }
        else -> "Unrecognized shape"
    }
    print(area)
}