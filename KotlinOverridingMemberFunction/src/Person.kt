/**
 * Created by Vangelis on 10/20/17.
 */

// Empty primary constructor
//open class Person() {
//    open fun displayAge(age: Int) {
//        println("My age is $age.")
//    }
//}
//
//class Girl: Person() {
//    override fun displayAge(age: Int) {
//        println("My fake age is ${age - 5}.")
//    }
//}
//fun main(args: Array<String>) {
//    val girl = Girl()
//    girl.displayAge(31)
//}

// Empty primary constructor
//open class Person() {
//    open var age: Int = 0
//        get() = field
//        set(value) {
//            field = value
//        }
//}
//
//class Girl: Person() {
//    override var age: Int = 0
//    get() = field
//    set(value) {
//        field = value - 5
//    }
//}
//
//fun main(args: Array<String>) {
//
//    val girl = Girl()
//    girl.age = 31
//    println("My fake age is ${girl.age}.")
//}


// Calling Members of Base Class from Derived Class
open class Person() {
    open fun displayAge(age: Int) {
        println("My actual age is $age.")
    }
}

class Girl: Person() {
    override fun displayAge(age: Int) {

        // calling function of base class
        super.displayAge(age)

        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = Girl()
    girl.displayAge(31)
}











