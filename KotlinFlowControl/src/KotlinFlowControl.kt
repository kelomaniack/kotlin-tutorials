/**
 * Created by Vangelis on 10/9/17.
 */

fun main(args: Array<String>) {

    // old "classic" style
//    val number = -10
//
//    if (number > 0) {
//        print("Positive number")
//    }
//    else {
//        print("Negative number")
//    }

    // new style
//    val number = -10
//
//    val result = if (number >0) {
//        "Positive number"
//    }
//    else {
//        "Negative number"
//    }
//    println(result)
//
//    val result2 = if (number > 0 ) "Positive number" else "Negative number"
//    println(result2)
//
//
//    val a = -9
//    val b = -11
//
//    val max = if (a > b) {
//        println("$a is larger than $b.")
//        println("max variable holds value of a.")
//        a
//    }
//    else {
//        println("$b is larger than $a.")
//        println("max variable holds value of b.")
//        b
//    }
//    println("max = $max")

//    val number = 0
//
//    val result = if (number > 0)
//        "positive number"
//    else if (number < 0)
//        "negative number"
//    else
//        "zero"
//
//    println("number is $result")

//    val n1 = 3
//    val n2 = 5
//    val n3 = -2
//
//    val max = if (n1 > n2) {
//        if (n1 > n3)
//            n1
//        else
//            n3
//    } else {
//        if (n2 > n3)
//            n2
//        else
//            n3
//    }
//
//    println("max = $max")

//    val a = 12
//    val b = 5
//
//    println("Enter operator either +, -, * or /")
//    val operator = readLine()
//
////    val result = when (operator) {
////        "+" -> a + b
////        "-" -> a - b
////        "*" -> a * b
////        "/" -> a / b
////        else -> "$operator operator is invalid operator."
////    }
////    println("result = $result")
//
//    when (operator) {
//        "+" -> println("$a + $b = ${a + b}")
//        "-" -> println("$a + $b = ${a - b}")
//        "*" -> println("$a + $b = ${a * b}")
//        "/" -> println("$a + $b = ${a / b}")
//        else -> println("$operator is invalid")
//    }

//    val n = -1
//
//    when (n) {
//        1, 2, 3 -> println("n is a positive integer less than 4.")
//        0 -> println("n is zero")
//        -1, -2 -> println("n is a negative integer greater than 3.")
//    }

//    val a = 100
//
//    when (a) {
//        in 1..10 -> println("A positive number less than 11.")
//        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
//    }
//
//    val x = 10
//    when (x) {
//        is Int -> print(x +1)
//        is String -> print(x.length + 1)
//        is IntArray -> print(x.sum())
//    }


//    val a = 11
//    val n = "11"
//
//    when (n) {
//        "cat" -> println("Cat? Really?")
//        12.toString() -> println("Close but not close enough.")
//        a.toString() -> println("Bingo! It's eleven.")
//    }

//
//    var i = 1
//
//    while (i <= 5) {
//        println("Line $i")
//        ++i
//    }

//    var sum = 0
//    var i = 100
//
//    while (i != 0) {
//        sum += i     // sum = sum + i;
//        --i
//    }
//    println("sum = $sum")

//    var sum: Int = 0
//    var input: String
//
//    do {
//        print("Enter an integer: ")
//        input = readLine()!!
//        sum += input.toInt()
//
//    } while (input != "0")
//
//    println("sum = $sum")

//    for(i in 1..5) {
//        println(i)
//    }
//
//    for(i in 1..5) println(i)

//    print("for (i in 1..5) print(i) = ")
//    for (i in 1..5) print(i)
//
//    println()
//
//    print("for (i in 5..1) print(i) = ")
//    for (i in 5..1) print(i)
//
//    println()
//
//    print("for (i in 5 downTo 1) print(i) = ")
//    for (i in 5 downTo 1) print(i)
//
//    println()
//
//    print("for (i in 1..4 step 2) print(i) = ")
//    for (i in 1..5 step 2) print(i)
//
//    println()
//
//    print("for (i in 4 downTo step 2) print(i) = ")
//    for (i in 5 downTo 1 step 2) print(i)

//    // iterating through an array
//    var language = arrayOf("Ruby", "Koltin", "Python", "Java")
//
//    for (item in language)
//        println(item)

    // iterating through an array with an index
    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language.indices)
        if (item%2 == 0 )
            println(language[item])

    var text="Kotlin"

    for (letter in text) {
        println(letter)
    }

    for (item in text.indices)
        println(text[item])














































}


