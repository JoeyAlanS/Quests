import kotlin.random.Random

fun main() {
    var x: Int = Random.nextInt(1, 51)
    if (x % 2 == 0)
        println("Numero sorteado e par $x")
    else
        println("Numero sorteado e impar $x")
}