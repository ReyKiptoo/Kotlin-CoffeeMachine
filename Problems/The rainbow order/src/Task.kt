import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val color = input.next().toUpperCase()
    var rainbow: Rainbow = Rainbow.RED
    when (color) {
        "RED" -> rainbow = Rainbow.RED
        "ORANGE" -> rainbow = Rainbow.ORANGE
        "YELLOW" -> rainbow = Rainbow.YELLOW
        "GREEN" -> rainbow = Rainbow.GREEN
        "BLUE" -> rainbow = Rainbow.BLUE
        "INDIGO" -> rainbow = Rainbow.INDIGO
        "VIOLET" -> rainbow = Rainbow.VIOLET
    }
    println(rainbow.ordinal + 1)
}

enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}
