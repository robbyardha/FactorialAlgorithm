package Ardhacodes.factorial

fun main() {
    println("Input Your Factorial, Must Be Integer")
    val input = readLine()!!
    println("Your input is ${input}")

    if (input.matches(Regex("-?\\d+(\\.\\d+)?"))){
        var result = 1
        for(i in input.toInt() downTo 1){
            result = i*result
            println(result)
        }
    }else{
        println("Sorry Not Number or NULL")
    }
}