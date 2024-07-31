fun main(){
    val number = (-10..10).random()
    println("Random number = $number")

    val result = if (number > 0){

        "This is a positive number"
    }else if (number == 0){

        "Number is zero"
    }else{

        "This is a negative number"
    }

    println("Result = $result")

    val a = 5
    val b = 15

    val largeNumber = if (a > b){
        println("a is larger than b")
        a
    }else{
        println("b is larger than a")
        b
    }

    println("Largest Number = $largeNumber")

    val Mathematics = 70
    val English = 80
    val Kiswahili = 66

    val max = if (Mathematics > English){
        if (Mathematics > Kiswahili){
                Mathematics
        }else{
            Kiswahili
        }
    }else{
        if (English > Mathematics){
            English
        }else{
            Kiswahili
        }
    }
    println("The max score = $max")
}