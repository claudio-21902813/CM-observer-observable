package pt.ulusofona.com.kotlin.observerobservable.classes

import pt.ulusofona.com.kotlin.observerobservable.interfaces.OnNumeroListener

class LeitorPar: Leitor("frfr"), OnNumeroListener {

    private val lista: List<Int>

    init {
        lista = ArrayList()
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