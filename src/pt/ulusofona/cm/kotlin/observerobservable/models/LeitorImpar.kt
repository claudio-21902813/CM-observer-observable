package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class LeitorImpar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    init {
        numeros = arrayListOf()
    }

    override fun leitorAdicionadoComSucesso() {
        super.leitorAdicionadoComSucesso()
    }

    override fun leitorRemovidoComSucesso() {
        super.leitorRemovidoComSucesso()
    }

    override fun onReceiveNumero(numero: Int) {
        numeros.add(numero)
    }

    fun imprimeNumeros(): String{
        var msg = ""
        numeros.forEach {
            if (it % 2 == 1) {
                msg += it
            }
        }
        return msg
    }

}