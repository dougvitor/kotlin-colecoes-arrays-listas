package br.com.home.lists

fun main(){

    livrosAceitaNulos.imprimeListaComMarcadores()

    livrosAceitaNulos.imprimeLivrosAgrupadosPorEditora()

    val prateleira: Prateleira = Prateleira(genero = "Literatura", livros = livros)

    val porAutor = prateleira.ordenaPorAutor()
    val porAnoPublicacao = prateleira.ordenaPorAnoPublicacao()

    porAutor.imprimeListaComMarcadores()
    porAnoPublicacao.imprimeListaComMarcadores()

}