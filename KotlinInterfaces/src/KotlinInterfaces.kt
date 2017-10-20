/**
 * Created by Vangelis on 10/20/17.
 */
//interface MyInterface {
//
//    val test: Int
//
//    fun foo() : String
//
//    fun hello() {
//        println("Hello there, pal!")
//    }
//}
//
//class InterfaceImp : MyInterface {
//
//    override val test: Int = 25
//    override fun foo() = "Lol"
//
//}
//
//fun main(args: Array<String>) {
//    val obj = InterfaceImp()
//
//    println("test = ${obj.test}")
//    print("Calling hello(): ")
//
//    obj.hello()
//
//    print("Calling and printing foo(): ")
//    println(obj.foo())
//}

//interface MyInterface {
//
//    // property with implementation
//    val prop: Int
//        get() = 23
//}
//
//class InterfaceImp : MyInterface {
//    // class body
//}
//
//fun main(args: Array<String>) {
//    val obj = InterfaceImp()
//
//    println(obj.prop)
//}
//interface A {
//
//    fun callMe() {
//        println("From interface A")
//    }
//}
//
//interface B  {
//    fun callMeToo() {
//        println("From interface B")
//    }
//}
//
//// implements two interfaces A and B
//class Child: A, B
//
//fun main(args: Array<String>) {
//    val obj = Child()
//
//    obj.callMe()
//    obj.callMeToo()
//}

// Resolving overriding conflicts (Multiple Interface)
interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B  {
    fun callMe() {
        println("From interface B")
    }
}

class Child: A, B {
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}

fun main(args: Array<String>) {
    val obj = Child()

    obj.callMe()
}