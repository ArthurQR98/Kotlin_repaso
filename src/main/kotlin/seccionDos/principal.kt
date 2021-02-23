package seccionDos

fun main() {
    // para leer datos por consola
    println("Ingrese su nombre")
    val nombre = readLine()
    println("Ingresa tu edad")
    val edad = readLine()

//    println("Mi nombre es: $nombre \ny tengo $edad")

    // RAW STRING
    print("""
        *** DATOS DE SALIDA ***
        NOMBRE : $nombre
        EDAD : $edad
    """.trimIndent())
}
