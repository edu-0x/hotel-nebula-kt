package Hotel

// Lista GLOBAL (importante!)
val listaHospedes = mutableListOf(
    "Carlos Villagran",
    "Maria Antonieta de las Nieves",
    "Roberto Gómez Bolaños"
)

// MENU DE HÓSPEDES
fun cadastrarHospedes() {
    while (true) {
        println("\n--- Cadastro de Hóspedes ---")
        println("1 - Cadastrar hóspede")
        println("2 - Pesquisar hóspede")
        println("3 - Listar hóspedes")
        println("4 - Remover hóspede")
        println("5 - Voltar")

        when (readln().toIntOrNull()) {
            1 -> cadastrarHospede()
            2 -> pesquisarHospede()
            3 -> listarHospedes()
            4 -> removerHospede()
            5 -> return
            else -> println("Opção inválida!")
        }
    }
}

// CADASTRAR
fun cadastrarHospede() {
    println("Digite o nome do hóspede:")
    val nome = readln()

    listaHospedes.add(nome)
    println("Hóspede cadastrado com sucesso!")
}

// PESQUISAR
fun pesquisarHospede() {
    println("Digite o nome para busca:")
    val nome = readln()

    if (listaHospedes.contains(nome)) {
        println("✅ Hóspede encontrado!")
    } else {
        println("❌ Hóspede não encontrado.")
    }
}

// LISTAR
fun listarHospedes() {
    println("\nLista de hóspedes:")
    listaHospedes.forEachIndexed { index, nome ->
        println("${index + 1} - $nome")
    }
}

// REMOVER (EXTRA 👍)
fun removerHospede() {
    println("Digite o nome do hóspede para remover:")
    val nome = readln()

    if (listaHospedes.remove(nome)) {
        println("Hóspede removido com sucesso.")
    } else {
        println("Hóspede não encontrado.")
    }
}