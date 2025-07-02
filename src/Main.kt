fun main() {

    var resultado = palindromo(s = "A man, a plan, a canal: Panama!!")
    println(resultado)


}

fun palindromo(s: String): Boolean {
    val tratando = s.lowercase().filter { it.isLetterOrDigit() }
    val reversed = tratando.reversed()
    return tratando == reversed
}