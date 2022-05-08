package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LeitorInexistenteException
import pt.ulusofona.cm.kotlin.observerobservable.exceptions.LimiteDeLeitoresAtingidoException
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

data class CorreioDaLusofona(val maxLeitores: Int, val noticias: List<Noticia>) {

    private val leitores: ArrayList<OnNoticiaListener>

    init {
        leitores = ArrayList()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(noticiaListener: OnNoticiaListener){
        if(leitores.size > maxLeitores){
            throw LimiteDeLeitoresAtingidoException("CorreioDaLusofona atingiu o número máximo de leitores: $maxLeitores")
        }
        noticiaListener.leitorAdicionadoComSucesso()
        leitores.add(noticiaListener)
    }

    fun removerLeitor(noticiaListener: OnNoticiaListener){
        if (!leitores.contains(noticiaListener)) {
            throw LeitorInexistenteException()
        }
        noticiaListener.leitorRemovidoComSucesso()
        leitores.remove(noticiaListener)
    }

    fun notificarLeitores(){
        leitores.forEach {
            for (noticia in noticias) {
                it.onReceiveNoticia(noticia)
            }
        }
    }

}