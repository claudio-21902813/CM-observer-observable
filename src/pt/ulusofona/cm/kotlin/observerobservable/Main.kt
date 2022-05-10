package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.models.*


fun main() {

    val numeros = arrayListOf<Int>(1,2,3,4,5,6)

    val geradorNumerico = GeradorNumerico(2,numeros)
    val leitorPar = LeitorPar("Leitor de Pares")

    geradorNumerico.iniciar()
    geradorNumerico.adicionarLeitor(leitorPar)
    geradorNumerico.notificarLeitores()

    println(leitorPar.imprimeNumeros())

}