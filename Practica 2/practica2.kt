/*La operacion de multiplicacion de a por b usando sumas */
fun main() {
    print("Número a: ")
    val a = readln().toInt()
    print("Número b: ")
    val b = readln().toInt()

    var suma = 0
    var salida = ""

    for (i in 1..b) {
        suma += a
        if (i == b) salida += "$a" else salida += "$a + "
    }

    println("$salida = $suma")
}