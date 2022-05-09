package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel

abstract class Leitor(val nome: String): Registavel {

    private var registado: Boolean = false
    var numeros: ArrayList<Int> = arrayListOf()

    override fun leitorAdicionadoComSucesso() {
        registado = true
    }

    override fun leitorRemovidoComSucesso() {
        registado = false
    }

    fun estaRegistado() = registado

}