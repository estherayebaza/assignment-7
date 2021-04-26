fun main() {

oddNumbers()
   println( sisterNames())
    robot(3)
    robot(8)
    robot(33)
    numberRanges()


}
fun oddNumbers(){
    for(n in 1..100)
        if ( n%2 ==1){
            println (n)
        }
    }
fun sisterNames():Int{
    var names = arrayOf("Kyarikunda", "Janet", "Irene", "Joy","Phionah")
var x=0
    for (name in names) {
        if (name.length > 5) {
            x++;
        }
    }
return x
}

fun robot(age: Int) {
    if (age < 6) {
        println("Serve  a glass of milk")
    }
    else if (age > 6 && age < 15) {
        println("Serve guests a bottle of fanta orange ")
    } else {
        println("Serve everybody a bottle of coca cola")
    }
}
fun numberRanges() {
    for (i in 1..100) {
      if (i % 3 == 0) {
           println("Fizz")
        }
        else if (i % 5 == 0) {
            println("Buzz")
        }
        else if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        }
        else {
            println(i)
        }
    }
}