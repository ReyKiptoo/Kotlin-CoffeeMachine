fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time.coerceIn(-128, 127))
}

class ByteTimer(var time: Int) {}