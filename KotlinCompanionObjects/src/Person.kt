/**
 * Created by Vangelis on 10/20/17.
 */
class Person {
    companion object Test {
        fun callMe() = println("I'm called.")
    }
}

fun main(args: Array<String>) {
    val p1 = Person()

    // calling callMe() method using object p1
    Person.callMe()
}
