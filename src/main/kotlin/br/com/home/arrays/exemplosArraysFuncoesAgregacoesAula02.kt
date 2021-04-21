import br.com.home.arrays.bigDecimalArrayOf
import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    val base = 1500.0
    val topo = 4000.0
    var contador = 0

    val salarios:DoubleArray = doubleArrayOf(1000.0, 2000.0, 3000.0, 4000.0, 5000.0)

    for(salario in salarios){
        if(salario in base..topo){
            contador++
        }
    }
    println(contador)

    val contadorFuncaoAgregadora = salarios.count { it in base..topo }
    println(contadorFuncaoAgregadora)

    val idades: IntArray = intArrayOf(25, 17, 33, 20)

    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val mediaIdade = idades.average()
    println(mediaIdade)

    val todosMaiores = idades.all { it >= 18 }
    println(todosMaiores)

    val todosMenores = idades.any{it < 18}
    println(todosMenores)

    val maiores = idades.filter{ it >= 18}.toIntArray()
    println(maiores.contentToString())

    val menores = idades.filter{ it < 18}.toIntArray()
    println(menores.contentToString())

    val contemDez = idades.contains(10)
    println(contemDez)

    val idade10 = idades.find { it == 10 }
    println(idade10)

    val salariosBigDecimal = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salariosBigDecimal.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosComAumento:Array<BigDecimal> = salariosBigDecimal.map { salario -> calculaAumento(salario, aumento) }.toTypedArray()
    println(salariosComAumento.contentToString())

    val salariosBrutos:Array<BigDecimal> = bigDecimalArrayOf("1000.0", "2000.0", "3000.0", "4000.0", "5000.0")

    salariosBrutos.forEachIndexed { i, salario ->
        salariosBrutos[i] = salario + (salario * (0.1).toBigDecimal())
        println("Salário com acréscimo de 10%: ${salariosBrutos[i]}")
    }

    salariosBrutos.forEachIndexed{i, salario ->
        salariosBrutos[i] = salario / ((1 + 0.1).toBigDecimal())
        println("Salário com desconto de 10%: ${salariosBrutos[i]}")
    }

}

private fun calculaAumento(salario: BigDecimal, aumento: BigDecimal): BigDecimal{

    return if(salario < "5000.0".toBigDecimal()){
        salario + "500.0".toBigDecimal()
    }else{
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}