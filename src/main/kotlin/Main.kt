fun main(){
    oddNums()
    fizzBuzz()
    guestAge(26)
    guestAge(3)
    guestAge(9)
    println(arrNames(arrayOf("Janet", "Sheenah", "joy", "AkiraChix", "Sly")))
}
//Create a function that prints out all the odd numbers between 1 and 60(2pts)
fun oddNums(){
    for (num in 1..60) {
        if (num % 2 != 0) {
            println(num)
//            println(numbers{.Random.nextInt(0, 60) })
        }
    }

}

//Takes in arrays of names and returns the number of names longer than 7 chars
fun arrNames(names: Array<String>): Int {
    var number = 0
    for (name in names) {
        if (name.length > 7) {
            println(name)
            number ++
        }
    }
    return number
}
//For making decisions depending on age

fun guestAge(age: Int) {
    when (age) {
        in 0..3 -> println("Milk")
        in 9..16 -> println("Fanta Orange")
        else -> println("Bottle of Coca Cola")
    }
}

//prints each number from 1 to 70 on a new line."Fizz" for multiples of three "Buzz" for 5 and "FizzBuzz"
//for multiples of both 3 and 5.
fun fizzBuzz() {
    for (num in 1..70) {
        if(num % 15 === 0){
            println("FizzBuzz")
        }
        else if (num % 3 == 0) {
            println("Fizz")
        }
        else if (num % 5 == 0) {
            println("Buzz")
        }
        else {
            println(num)
        }
    }
}
