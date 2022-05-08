package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class GeradorNumerico(val maxLeitores: Int, val informacoes: List<Int>) {

    private val lista: List<OnNumeroListener>

    init {
        lista = ArrayList()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(noticiaListener: OnNumeroListener){
        TODO()
    }

    fun removerLeitor(noticiaListener: OnNumeroListener){
        TODO()
    }

    fun notificarLeitores(){
        TODO()
    }

}