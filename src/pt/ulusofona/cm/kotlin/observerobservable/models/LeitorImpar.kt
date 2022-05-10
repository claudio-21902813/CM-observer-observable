package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class LeitorImpar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros = mutableListOf<Int>()

    override fun onReceiveNumero(numero: Int) {
        if(numero % 2 == 1){
            numeros.add(numero)
        }
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