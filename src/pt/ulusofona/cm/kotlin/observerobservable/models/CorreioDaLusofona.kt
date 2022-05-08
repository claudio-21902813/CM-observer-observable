package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

data class CorreioDaLusofona(val maxLeitores: Int, val noticias: List<Noticia>) {

    private val lista: List<OnNoticiaListener>

    init {
        lista = ArrayList()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(noticiaListener: OnNoticiaListener){
        TODO()
    }

    fun removerLeitor(noticiaListener: OnNoticiaListener){
        TODO()
    }

    fun notificarLeitores(){
        TODO()
    }

}