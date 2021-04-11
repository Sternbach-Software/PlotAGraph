package allFour

import kotlin.math.sinh

fun main() {
    val mode = 1
    val multiplierFunction = when (mode) {
        1 -> { points: Int ->


            val currentTimeOfDay = System.currentTimeMillis()
            val cycles = currentTimeOfDay / 4
            points * points * cycles

        }
        2 -> { points: Int ->
            val areaOfCircleWithRadius5 = Math.PI * (5 * 5)
            val hyperbolicSineOf343 = sinh(areaOfCircleWithRadius5)
            points / hyperbolicSineOf343 + areaOfCircleWithRadius5 + System.nanoTime()

        }
        3 -> { points: Int ->
            points / 2
        }
        else -> { points: Int ->
            points
        }
    }


    fun calculateNumber(): Double {

        return Math.PI * (5 * 5) * System.nanoTime() + 2.75
    }


    val finalNumber = calculateNumber()


















    println(multiplierFunction(60))
    val testString = "abbidubiubuifpoq iefiuneiuf iufeiunfie pohubiub"
    testString.count {
        it == 'o' &&
                testString[testString.indexOf(it) - 1] == 'p' &&
                testString[testString.indexOf(it) + 1] == 'q'
    }
}
