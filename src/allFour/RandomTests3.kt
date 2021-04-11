package allFour

data class myInt(val num: Int)

fun main() {
    val one = myInt(1)
    val onePlus2Plus7 = one + 2
    println(onePlus2Plus7)
}

operator fun myInt.plus(a:Int):Int{
    return this.num+a+7
}

fun factorial(num: Int) = (2..num).fold(1, Int::times)
