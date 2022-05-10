package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class LeitorPar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros: MutableList<Int> = mutableListOf()

    override fun onReceiveNumero(numero: Int) {
        if(numero % 2 == 0) {
            numeros.add(numero)
        }
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