/**
 * Created by Vangelis on 10/20/17.
 */
//fun main(args: Array<String>) {
//    val a = 5
//    val b = 10
//
//    print(a + b)
//}

//fun main(args: Array<String>) {
//    val p1 = Point(3, -8)
//    val p2 = Point(2, 9)
//
//    var sum = Point()
//    sum = p1 + p2
//
//    println("sum = (${sum.x}, ${sum.y})")
//}
//
//class Point(val x: Int = 0, val y: Int = 10) {
//
//    // overloading plus function
//    operator fun plus(p: Point) : Point {
//        return Point(x + p.x, y + p.y)
//    }
//}

//fun main(args: Array<String>) {
//    var point = Point(3, -8)
//    --point
//
//    println("point = (${point.x}, ${point.y})")
//}
//
//class Point(var x: Int = 0, var y: Int = 10) {
//    operator fun dec() = Point(--x, --y)
//}

fun main(args: Array<String>) {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2

    println("sum = (${sum.x}, ${sum.y})")
}

class Point(val x: Int = 0, val y: Int = 10) {

    // overloading plus function
    operator fun plus(p: Point) = Point(x - p.x, y - p.y)
}