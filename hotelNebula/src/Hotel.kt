package Hotel

fun main() {
    inicio()
}

fun inicio() {
    println("\nBem-vindo ao Hotel Terabithia!")
    println("1 - Cadastrar Quartos")
    println("2 - Cadastrar Hóspedes")
    println("3 - Abastecimento de Automóveis")
    println("4 - Sair")

    val escolha = readln().toIntOrNull()

    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> abastecimentoDeAutomoveis()
        4 -> sairDoHotel()
        else -> erro()
    }
}

fun cadastrarQuartos() {
    println("Funcionalidade de quartos ainda não implementada.")
    inicio()
}

fun abastecimentoDeAutomoveis() {
    println("Funcionalidade de abastecimento ainda não implementada.")
    inicio()
}

fun erro() {
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sairDoHotel() {
    println("Deseja sair? (S/N)")
    val confirma = readln().uppercase()

    if (confirma == "S") {
        println("Até logo!")
    } else {
        inicio()
    }
}