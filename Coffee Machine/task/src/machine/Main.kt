package machine

import java.util.*

val scanner = Scanner(System.`in`)

var waterAvailable = 400
var milkAvailable = 540
var coffeeAvailable = 120
var cupsAvailable = 9
var moneyAvailable = 550

fun main() {
    // printCurrentStatus()
    // println()
    mainCycle()
    // println()
    // printCurrentStatus()
}
fun printCurrentStatus() {
    println("The coffee machine has:")
    println("$waterAvailable of water")
    println("$milkAvailable of milk")
    println("$coffeeAvailable of coffee beans")
    println("$cupsAvailable of disposable cups")
    println("$moneyAvailable of money")
}
fun buy() {
    println("What do you want to buy?")
    println("1 - espresso, 2 - latte, 3 - cappuccino:")
    when (scanner.next()) {
        "1" -> {
            if (waterAvailable >= 250 && coffeeAvailable >= 16 && cupsAvailable >= 1) {
                waterAvailable -= 250
                coffeeAvailable -= 16
                cupsAvailable -= 1
                moneyAvailable += 4
            } else {
                if (waterAvailable < 250) {
                    print("Sorry, not enough water!")
                } else if(coffeeAvailable < 16) {
                    print("Sorry, not enough cofee beans!")
                }
            }
        }
        "2" -> {
            if (waterAvailable >= 350 && coffeeAvailable >= 20 && cupsAvailable >= 1 && milkAvailable >= 75) {
                waterAvailable -= 350
                milkAvailable -= 75
                coffeeAvailable -= 20
                cupsAvailable -= 1
                moneyAvailable += 7
            } else {
                if (waterAvailable < 350) {
                    print("Sorry, not enough water!")
                } else if(coffeeAvailable < 20) {
                    print("Sorry, not enough cofee beans!")
                } else if(milkAvailable < 75) {
                    print("SOrry, not enough milk!")
                }
            }
        }
        "3" -> {
            if (waterAvailable >= 200 && coffeeAvailable >= 12 && cupsAvailable >= 1 && milkAvailable >= 100) {
                waterAvailable -= 200
                milkAvailable -= 100
                coffeeAvailable -= 12
                cupsAvailable -= 1
                moneyAvailable += 6
            } else {
                 if (waterAvailable < 200) {
                    print("Sorry, not enough water!")
                } else if(coffeeAvailable < 12) {
                    print("Sorry, not enough cofee beans!")
                } else if(milkAvailable < 100) {
                    print("SOrry, not enough milk!")
                }
            }
            
        }
        "back" -> {
            mainCycle()
        }
    }
}
fun fill() {
    println("Write how many ml of water do you want to add:")
    val waterToAdd = scanner.nextInt()
    println("Write how many ml of milk do you want to add:")
    val milkToAdd = scanner.nextInt()
    println("Write how many grams of coffee beans do you want to add:")
    val coffeeToAdd = scanner.nextInt()
    println("Write how many disposable cups of coffee do you want to add:")
    val cupsToAdd = scanner.nextInt()
    waterAvailable += waterToAdd
    milkAvailable += milkToAdd
    cupsAvailable += cupsToAdd
    coffeeAvailable += coffeeToAdd
}
fun take() {
    println("I gave you \$$moneyAvailable")
    moneyAvailable = 0
}
fun mainCycle() {
       while (scanner.hasNext()) {
        println("Write action (buy, fill, take, remaining)")
        when (scanner.next()) {
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()
        "remaining" -> printCurrentStatus()
        "exit" -> System.exit(0)
    }
    }
}