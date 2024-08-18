class Pessoa(val nome: String, val idade: Int, val profissao: String)

fun main() {
    val pessoa1 = Pessoa("Alan", 25, "Engenheiro")
    val pessoa2 = Pessoa("Bernado", 30, "Professora")
    val pessoa3 = Pessoa("Mario", 22, "Estudante")

    val pessoas = listOf(pessoa1, pessoa2, pessoa3)

    pessoas.forEach { pessoa ->
        println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}, Profissao: ${pessoa.profissao}")
    }
}