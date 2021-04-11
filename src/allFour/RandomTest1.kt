package allFour

fun main() {

var x = 5
    println("Should be 5: $x")
    val multiplier = {
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }
}

private fun addFour(mutableList: MutableList<Int>) {
    mutableList.add(4)
}

fun plus(a:Int, b:Int):Int{
    return a+b
}
fun plusUninlined(a:Int,b:Int):Int{
    return a+b
}