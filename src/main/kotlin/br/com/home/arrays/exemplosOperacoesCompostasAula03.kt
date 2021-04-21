package br.com.home.arrays

import java.math.RoundingMode

fun main(){

    val salariosBigDecimal = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    val somatoria = salariosBigDecimal.somatoria()
    println(somatoria)

    val meses = 6.toBigDecimal()
    val acumuladoProximos6Meses = salariosBigDecimal.fold(somatoria){ acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(acumuladoProximos6Meses)

    println(salariosBigDecimal.media())

    val media3MaioresSalarios = salariosBigDecimal.sorted().takeLast(3).toTypedArray().media()
    println(media3MaioresSalarios)

    val media3MenoresSalarios = salariosBigDecimal.sorted().take(3).toTypedArray().media()
    println(media3MenoresSalarios)

}

