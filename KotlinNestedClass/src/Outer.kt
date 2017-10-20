/**
 * Created by Vangelis on 10/20/17.
 */
//class Outer {
//    val a = "Outside Nested class."
//
//    class Nested {
//        val b = "Inside Nested class."
//        fun callMe() = "Function call from inside Nested class."
//    }
//}
//
//fun main(args: Array<String>) {
//    // accessing member of Nested class
//    println(Outer.Nested().b)
//
//    // creating object of Nested class
//    val nested = Outer.Nested()
//    println(nested.callMe())
//}

// Kotlin Inner Class
// The nested classes in Kotlin do not have access to the outer class instance, for example:
//class Outer {
//    val foo = "Outside Nested class."
//
//    class Nested {
//        // Error! cannot access member of outer class.
//        fun callMe() = foo
//    }
//}
//
//fun main(args: Array<String>) {
//
//    val outer = Outer()
//    println(outer.Nested().callMe())
//}

// In order to solve this issue, you need to mark the nested class with inner to create an inner class. Inner classes carry a reference to an outer class, and can access outer class members.
// Kotlin Inner Class
class Outer {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main(args: Array<String>) {

    val outer = Outer()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Using inner object: ${inner.callMe()}")

}