package academy.learnprogramming.oochallenge

import academy.learnprogramming.challenges.section3.javacode.Bicycle

fun main(args: Array<String>) {
//    val bike = KotlinBicycle(1,2,3)
//    val mountainBike = KotlinMountainBike(3,1,2,3)
//    val roadBike = KotlinRoadBike(10,1,2,3)
//
//    bike.printDescription()
//    mountainBike.printDescription()
//    roadBike.printDescription()
//
//
//
//    val bike2= KotlinBicycle(1,2)
//    val mountainBike2 = KotlinMountainBike(3,1,2)
//    val roadBike2 = KotlinRoadBike(10,1,2)
//
//    bike2.printDescription()
//    mountainBike2.printDescription()
//    roadBike2.printDescription()


    val mountainBike3 = KotlinMountainBike("Blue",10,10,10)
    mountainBike3.printDescription()
    KotlinMountainBike.printColors()
    KotlinMountainBike.availableColors.forEach { println(it)}
}


open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription(){
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }

}

class KotlinMountainBike(var seatHeight: Int,
                   cadence: Int,
                   speed: Int,
                         gear: Int = 10) : KotlinBicycle(cadence, speed, gear){

    companion object{
        val availableColors = listOf<String>("blue","red","white","black", "green", "brown")
        fun printColors()= println("The available colors are "+availableColors.joinToString(", "))
    }

    constructor(color:String, seatHeight: Int,cadence: Int,speed: Int,gear: Int = 10) :
            this(seatHeight, cadence, speed, gear){
        println("This is the $color")
    }


    override fun printDescription(){
        super.printDescription()
        println("The road bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(  val tireWidth: Int, cadence: Int,
               speed: Int,
                       gear: Int = 10
             ) : KotlinBicycle(cadence, speed, gear) {

    override fun printDescription(){
        super.printDescription()
        println("The road bike has a tire width of $tireWidth inches.")
    }
}

