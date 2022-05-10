package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.Registavel

abstract class Leitor(val nome: String): Registavel {

    private var registado: Boolean = false

    override fun leitorAdicionadoComSucesso() {
        registado = true
    }

    override fun leitorRemovidoComSucesso() {
        registado = false
    }

    fun estaRegistado() = registado
}

class LeitorPar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros: MutableList<Int> = mutableListOf()

    override fun onReceiveNumero(numero: Int) {
        numeros.add(numero)
    }

    fun imprimeNumeros(): String{
        var msg = ""
        numeros.forEach {
            if (it % 2 == 0) {
                msg += it
            }
        }
        return msg
    }

}