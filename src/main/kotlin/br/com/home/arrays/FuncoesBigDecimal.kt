package br.com.home.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun Array<BigDecimal>.somatoria(): BigDecimal{
    return this.reduce{ acumulador, valor -> acumulador + valor
    }
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(size = valores.size){
        valores[it].toBigDecimal()
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    if(this.isEmpty())  return BigDecimal.ZERO
   return (this.somatoria() / this.size.toBigDecimal()).setScale(2, RoundingMode.UP)
}