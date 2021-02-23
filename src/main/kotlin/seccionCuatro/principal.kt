package seccionCuatro

fun main() {
    /*
    * Conversion de tipo de dato
    *  */

//    val valor = "10"
//    val resultado = valor.toInt() * 5
//    println(resultado)

//    println("Ingresa un numero")
//    val numero = readLine()!!.toInt()
//    val resultado = numero * 10
//    println(resultado)
//

    println("Ingrese el lado")
    val lado = readLine()!!.toDouble()
    val resultado = lado * lado
    println("""
        --***----***----***----***--
        El area es : $resultado
        --***----***----***----***--
    """.trimIndent())
}