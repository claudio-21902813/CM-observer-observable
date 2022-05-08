package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class GeradorNumerico(val maxLeitores: Int, val informacoes: List<Int>) {

    private val leitores: ArrayList<OnNumeroListener>

    init {
        leitores = arrayListOf()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(numeroListener: OnNumeroListener){
        if(leitores.size > maxLeitores){
            throw LimiteDeLeitoresAtingidoException("GeradorNumerico atingiu o número máximo de leitores: $maxLeitores")
        }
        leitores.add(numeroListener)
    }

    fun removerLeitor(numeroListener: OnNumeroListener){
        if (!leitores.contains(numeroListener)) {
            throw LeitorInexistenteException()
        }
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