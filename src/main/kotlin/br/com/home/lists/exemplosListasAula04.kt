package br.com.home.lists

fun main(){

    println(livros)

    livros.add(Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    ))
    println(livros)

    livros.remove(livro3)
    println(livros)

    livros.imprimeListaComMarcadores()

    livros.sorted().imprimeListaComMarcadores()

    livros.sortedBy { it.titulo }.imprimeListaComMarcadores()

    println("\n ${livros.titulosPorAutorOrdenadoPorAnoPublicacao("J")}")

}

fun List<Livro>.titulosPorAutorOrdenadoPorAnoPublicacao(prefix: String): List<String>{
    return this.filter {it.autor.startsWith(prefix)}
               .sortedBy { it.anoPublicacao }
               .map { it.titulo }
}