// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(sideA > 0 && sideB > 0 && sideC > 0) { "Sides must be positive" }
        require(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            "Sides do not form a valid triangle"
        }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = 0.5 * perimeter

    val area: Double
        get() {
            val s = semiPerimeter
            return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        }

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}

fun main() {
    val t = Triangle(3.0, 4.0, 5.0)
    println(t)
    println(t.perimeter)
    println(t.semiPerimeter)
    println(t.area)
}
