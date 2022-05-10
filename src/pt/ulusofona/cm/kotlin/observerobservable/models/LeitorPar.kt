package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class LeitorPar(val nomeLeitor: String): Leitor(nomeLeitor), OnNumeroListener {

    val numeros = mutableListOf<Int>()

    override fun onReceiveNumero(numero: Int) {
        if(numero % 2 == 0) {
            numeros.add(numero)
        }
    }

    fun imprimeNumeros(): String{
        return "$nomeLeitor leu os seguintes numeros pares:$numeros"
    }

}