package academy.learnprogramming.challenge1

fun main(args: Array<String>) {

    //Declare two immutable String variables called hello1 and hello2. Assign "Hello"
    //to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    //Using one line of code, test wether hello1 and hello2 are referentially equal
    //and print the result

    println("Referentially equal: ${hello1 === hello2}")

    //Do the same as above, but test for structural equality

    println("Structural equal: ${hello1 == hello2}")

    //Declare a mutable variable of type Int and assign it the value of 2988

    var intNum = 2988;

    //Declare an mutable variable of type Any and assign it the string "The Any type is the root of the Kotlin class hierarchy". Then using
    //a smart cast, print out uppercased string

    val anyVal : Any = "The Any type is the root of the Kotlin class hierarchy"

    if(anyVal is String){
        println(anyVal.toUpperCase())
    }


    // Using one line of code, print out the following. Make sure your codee is nicely indented.

    println("""   1
        |  11
        | 111
        |1111""".trimMargin())

}