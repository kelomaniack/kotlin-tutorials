/**
 * Created by Vangelis on 10/20/17.
 */

fun main(args: Array<String>) {

//    val person1 = Person("Joe", 25)

//    println("First Name = ${person1.firstName}")
//    println("Age = ${person1.age}")
    println("person1 is instantiated")
    val person1 = Person("joe", 25)

    println("person2 is instantiated")
    val person2 = Person("Jack")

    println("person3 is instantiated")
    val person3 = Person()
}

class Person(val _firstName: String = "UNKNOWN", var _age: Int = 0) {
//    val firstName: String
//    var age: Int
//
//    // initializer block
//    init {
//        firstName = fName.capitalize()
//        age = personAge
//
//        println("First Name = $firstName")
//        println("Age = $age")
//
//    }

    /**
     *  var is like general variable and its known as a mutable variable in kotlin and can be assigned multiple times.

     *  val is like constant variable and its known as immutable in kotlin and can be initialized only single time.
     *
     */
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age")
    }

}