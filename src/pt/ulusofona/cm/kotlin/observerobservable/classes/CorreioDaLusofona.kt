package pt.ulusofona.cm.kotlin.observerobservable.classes

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

data class CorreioDaLusofona(val maxLeitores: Int, val noticias: List<Noticia>) {

    private val lista: List<OnNoticiaListener>

    init {
        lista = ArrayList()
    }

    private fun iniciar() = notificarLeitores()

    private fun adicionarLeitor(noticiaListener: OnNoticiaListener){
        TODO()
    }

    private fun removerLeitor(noticiaListener: OnNoticiaListener){
        TODO()
    }

    private fun notificarLeitores(){
        TODO()
    }

}