package br.com.home.lists

fun List<Livro?>.imprimeListaComMarcadores(){
    val listaComMarcadores = this.filterNotNull().joinToString(separator = "\n") { " - ${it.titulo} de ${it.autor}" }
    println("\n ### Lista de Livros ###\n$listaComMarcadores\n")
}

fun List<Livro?>.imprimeLivrosAgrupadosPorEditora(){
    this
        .filterNotNull()
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach{(editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }

}