package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class GeradorNumerico(val maxLeitores: Int, val informacoes: List<Int>) {

    private val lista: List<OnNumeroListener>

    init {
        lista = ArrayList()
    }

    private fun iniciar() = notificarLeitores()

    private fun adicionarLeitor(noticiaListener: OnNumeroListener){
        TODO()
    }

    private fun removerLeitor(noticiaListener: OnNumeroListener){
        TODO()
    }

    private fun notificarLeitores(){
        TODO()
    }

}