class Produto(var nome: String, var preco: Double, var quantidadeEstoque: Int)

fun main() {
    val produtos = mutableListOf(
        Produto("Notebook", 3500.0, 10),
        Produto("Celular", 2000.0, 15),
        Produto("Fone", 150.0, 30)
    )

    while (true) {
        println("\nMenu:")
        println("1. Atualizar Preco")
        println("2. Atualizar Quantidade em Estoque")
        println("3. Exibir Informacoes dos Produtos")
        println("4. Sair")
        print("Escolha uma opcao: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Digite o nome do produto: ")
                val nomeProduto = readLine()

                val produto = produtos.find { it.nome == nomeProduto }
                if (produto != null) {
                    print("Digite o novo preco: ")
                    val novoPreco = readLine()?.toDoubleOrNull()
                    if (novoPreco != null) {
                        produto.preco = novoPreco
                        println("Preco atualizado com sucesso!")
                        println("Nome: ${produto.nome}, Preco: R$ ${produto.preco}, Quantidade em Estoque: ${produto.quantidadeEstoque}")
                    } else {
                        println("Valor invalido!")
                    }
                } else {
                    println("Produto nao encontrado!")
                }
            }

            2 -> {
                print("Digite o nome do produto: ")
                val nomeProduto = readLine()

                val produto = produtos.find { it.nome == nomeProduto }
                if (produto != null) {
                    print("Digite a nova quantidade em estoque: ")
                    val novaQuantidade = readLine()?.toIntOrNull()
                    if (novaQuantidade != null) {
                        produto.quantidadeEstoque = novaQuantidade
                        println("Quantidade atualizada com sucesso!")
                        println("Nome: ${produto.nome}, Preco: R$ ${produto.preco}, Quantidade em Estoque: ${produto.quantidadeEstoque}")
                    } else {
                        println("Valor invalido!")
                    }
                } else {
                    println("Produto nao encontrado!")
                }
            }

            3 -> {
                println("\nInformacoes dos Produtos:")
                produtos.forEach {
                    println("Nome: ${it.nome}, Preco: R$ ${it.preco}, Quantidade em Estoque: ${it.quantidadeEstoque}")
                }
            }

            4 -> break

            else -> println("Opcao invalida! Tente novamente.")
        }
    }
}
