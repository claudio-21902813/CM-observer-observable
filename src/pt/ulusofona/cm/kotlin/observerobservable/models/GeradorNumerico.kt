package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class GeradorNumerico(val maxLeitores: Int, val informacoes: List<Int>) {

    private val leitores: ArrayList<OnNumeroListener>

    init {
        leitores = arrayListOf()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(numeroListener: OnNumeroListener){
        leitores.add(numeroListener)
    }

    fun removerLeitor(numeroListener: OnNumeroListener){
        leitores.remove(numeroListener)
    }

    fun notificarLeitores(){
        leitores.forEach {
            for (numero in informacoes) {
                it.onReceiveNumero(numero)
            }
        }
    }

}