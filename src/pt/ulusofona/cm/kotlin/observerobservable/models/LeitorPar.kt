package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class LeitorPar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros: List<Int>

    init {
        numeros = ArrayList()
    }

    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun onReceiveNumero(numero: Int) {
        TODO("Not yet implemented")
    }

    fun imprimeNumeros(): String{

        return "e"
    }

}