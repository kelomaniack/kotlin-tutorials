import java.util.*

/**
 * Created by Vangelis on 10/9/17.
 */
fun main(args : Array<String>) {

//    val number1 = 12.5
//    val number2 = 3.5
//    var result: Double
//
//    result = number1 + number2
//    println("number1 + number2 = $result")
//
//    result = number1 - number2
//    println("number1 - number2 = $result")
//
//    result = number1 * number2
//    println("number1 * number2 = $result")
//
//    result = number1 / number2
//    println("number1 / number2 = $result")
//
//    result = number1 % number2
//    println("number1 % number2 = $result")

//    val start = "Talk is cheap. "
//    val middle = "Show me the code. "
//    val end = "- Linus Torvalds"
//
//    val result = start + middle + end
//    println(result)
//
//    var number = 12
//
//    number *= 5
//    println("number = $number")
//
//    val a = 1
//    val b = true
//    var c = 1
//
//    var result: Int
//    var booleanResult: Boolean
//
//    result = -a
//    println("-a = $result")
//
//    booleanResult = !b
//    println("!b = $booleanResult")
//
//    --c
//    println("--c = $c")
//
//    --c
//    println("--c = $c")
//
//    --c
//    println("--c = $c")
//
//    ++c
//    println("++c = $c")
//
//    ++c
//    println("++c = $c")
//
//    ++c
//    println("++c = $c")
//
//    ++c
//    println("++c = $c")

//    val a = -12
//    val b = 12
//
//    // use of greater than operator
//    val max = if (a > b) {
//        println("a is larger than b.")
//        a
//    }
//    else {
//        println("b is larger than a.")
//        b
//    }
//
//    println("max = $max")

//    val a = 10
//    val b = 9
//    val c = -1
//    val result: Boolean
//
//    result = (a>b) && (a>c)
//    println(result)
//
//
//    val numbers = intArrayOf(1, 4, 42, -3)
//
//    if (4 in numbers) {
//        println("numbers array contains 4.")
//    }

//    val a = intArrayOf(1, 2, 3, 4, -1)
//    println(a[1])
//    a[1] = 12
//    println(a[1])

//    val number1: Int = 55
//    val number2: Long = number1.toLong()
//    println(number2)

//    val number1: Int = 545344
//    val number2: Byte = number1.toByte()
//    println("number1 = $number1")
//    println("number2 = $number2")

//    val a = 12
//    val b = 13
//    val max: Int
//
//    max = if (a > b) a else b
//    println(max)
//
//    val flag = true
//
//    if (flag == true) {
//        print("Hey ")
//        print("jude!")
//    }
//
//    println("Kotlin is interesting.")
//
//    println("1. println ");
//    println("2. println ");
//
//    print("1. print ");
//    print("2. print");
//
//    val score = 12.3
//
//    println("score")
//    println("$score")
//    println("score = $score")
//    println("${score + score}")
//    println(12.3)
    //print("Enter text: ")
//    val stringInput = readLine()!!
//    println("You entered: $stringInput")

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")


}

