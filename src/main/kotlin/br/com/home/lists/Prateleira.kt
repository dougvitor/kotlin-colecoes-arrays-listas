package br.com.home.lists

class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {

    fun ordenaPorAutor(): List<Livro>{
        return livros.sortedBy { it.autor }
    }

    fun ordenaPorAnoPublicacao(): List<Livro>{
        return livros.sorted()
    }
}