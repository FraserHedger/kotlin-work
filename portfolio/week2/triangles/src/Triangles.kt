// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(t: Triangle) : Boolean {
    val(a,b,c) = t
    return a + b > c && a + c > b && b + c > a
}

fun triangleArea(t: Triangle) : Double {
    

    val(a,b,c) = t
    
    val s = 0.5*(a+b+c)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    return area

}

// Add isValidTriangle() and triangleArea() functions here
