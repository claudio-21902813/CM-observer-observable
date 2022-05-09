package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.models.*


fun main() {

    val numeros = arrayListOf<Int>(1,2,3,4,5,6)

    val geradorNumerico = GeradorNumerico(2,numeros)
    val leitorPar = LeitorPar("Leitor de Pares")
    val leitorBufo = Bufo("Leitor Bufo")

    geradorNumerico.adicionarLeitor(leitorBufo)
    geradorNumerico.iniciar()
    println(leitorBufo.numeros)
}