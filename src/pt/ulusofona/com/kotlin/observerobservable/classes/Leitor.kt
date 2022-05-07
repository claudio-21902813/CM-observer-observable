package pt.ulusofona.com.kotlin.observerobservable.classes

import pt.ulusofona.com.kotlin.observerobservable.interfaces.Registavel

abstract class Leitor(val nome: String): Registavel {

    private val registado: Boolean = false

    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    fun estaRegistado() = registado

}