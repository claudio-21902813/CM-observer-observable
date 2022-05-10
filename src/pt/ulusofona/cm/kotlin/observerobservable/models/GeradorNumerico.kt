package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class GeradorNumerico(val maxLeitores: Int, val numeros: List<Int>) {

    val leitores: ArrayList<OnNumeroListener>

    init {
        leitores = arrayListOf()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(numeroListener: OnNumeroListener){
        if(leitores.size > maxLeitores - 1){
            throw LimiteDeLeitoresAtingidoException("GeradorNumerico atingiu o número máximo de leitores: $maxLeitores")
        }
        leitores.add(numeroListener)
        numeroListener.leitorAdicionadoComSucesso()
    }

    fun removerLeitor(numeroListener: OnNumeroListener){
        if (!leitores.contains(numeroListener)) {
            throw LeitorInexistenteException()
        }
        numeroListener.leitorRemovidoComSucesso()
        leitores.remove(numeroListener)
    }

    fun notificarLeitores(){
        leitores.forEach {
            for (numero in numeros) {
                it.onReceiveNumero(numero)
            }
        }
    }

}