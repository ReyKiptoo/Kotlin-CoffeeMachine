import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    
    var largestNumber = scanner.nextInt()
    var firstAppearance = 1
    var i = 1
    while (scanner.hasNext()) {
        var num = scanner.nextInt()
        if (num > largestNumber) {
            largestNumber = num
            firstAppearance = i + 1
        }
        i++
    }
    print("$largestNumber $firstAppearance")
 }