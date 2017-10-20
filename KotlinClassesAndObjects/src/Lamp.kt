/**
 * Created by Vangelis on 10/20/17.
 */

class Lamp {

    //property (data member)
    private var isOn: Boolean = false

    public

    // member function
    fun turnOn() {
        isOn = true
    }

    // member function
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus(lamp: String) {
        if (isOn == true)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }

    fun displayLightStatus() {
        if (isOn == true)
            println("lamp is on.")
        else
            println("lamp is off.")
    }
}

fun main(args: Array<String>) {
    val l1 = Lamp()
    val l2 = Lamp()

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")

    val lamp = Lamp()
    lamp.displayLightStatus()
}

