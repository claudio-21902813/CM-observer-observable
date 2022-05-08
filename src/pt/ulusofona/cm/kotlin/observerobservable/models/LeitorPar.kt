package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class LeitorPar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros: ArrayList<Int>

    init {
        numeros = arrayListOf()
    }

    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun onReceiveNumero(numero: Int) {
        numeros.add(numero)
    }

    fun imprimeNumeros(): String{
        var msg = ""
        for(numero in numeros) {
            msg += numero
        }
        return msg
    }

}