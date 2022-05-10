package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class LeitorPar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros: MutableList<Int> = mutableListOf()

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
            if (it % 2 == 0) {
                msg += it
            }
        }
        return msg
    }

}