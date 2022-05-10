package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.models.*


fun main() {

    val numeros = arrayListOf<Int>(1,2,3,4,5,6)

    val geradorNumerico = GeradorNumerico(2,numeros)
    val leitorPar = LeitorPar("Leitor de Pares")
    val leitorPar2 = LeitorPar("Leitor de Pares")
    val leitorPar3 = LeitorPar("Leitor de Pares")


    geradorNumerico.adicionarLeitor(leitorPar)
    println("tamanho da lista : ${geradorNumerico.leitores.size}")
    geradorNumerico.adicionarLeitor(leitorPar2)
    println("tamanho da lista : ${geradorNumerico.leitores.size}")
    println("tamanho da lista : ${geradorNumerico.leitores.size}")

    geradorNumerico.iniciar()

}