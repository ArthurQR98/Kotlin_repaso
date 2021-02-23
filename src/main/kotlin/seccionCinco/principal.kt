package seccionCinco

import java.text.*
import kotlin.math.*

fun main() {
    /*
    * Redondeos de numeros
    * */
    val numero = 3.5
    val nota = 14.9
    val pi = 3.1416
    println(round(numero).toInt())
    println(floor(nota).toInt())
    println(ceil(nota).toInt())

    // Para darle formato a un resultado
    println(DecimalFormat("#.##").format(pi))
}