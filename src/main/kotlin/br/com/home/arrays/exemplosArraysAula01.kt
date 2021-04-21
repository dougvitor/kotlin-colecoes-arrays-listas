fun main(){

    val idades: IntArray = intArrayOf(25, 19, 33, 20)

    var maiorIdade = Int.MIN_VALUE
    for(idade in idades){
        if(idade > maiorIdade){
            maiorIdade = idade
        }
    }
    println("A maior idade é: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach{ idade ->
        if(idade < menorIdade){
            menorIdade = idade
        }
    }
    println("A menor idade é: $menorIdade")

    val salarios:DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0, 4000.0, 5000.0)

    for(i in salarios.indices){
        salarios[i] =  salarios[i] + (salarios[i] * 0.1)
        println("Salário com acréscimo de 10%: ${salarios[i]}")
    }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario / (1 + 0.1)
        println("Salário com desconto de 10%: ${salarios[index]}")
    }


}