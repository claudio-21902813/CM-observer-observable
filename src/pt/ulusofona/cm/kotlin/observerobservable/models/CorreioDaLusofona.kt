package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener

data class CorreioDaLusofona(val maxLeitores: Int, val noticias: List<Noticia>) {

    private val leitores: ArrayList<OnNoticiaListener>

    init {
        leitores = ArrayList()
    }

    fun iniciar() = notificarLeitores()

    fun adicionarLeitor(noticiaListener: OnNoticiaListener){
        leitores.add(noticiaListener)
    }

    fun removerLeitor(noticiaListener: OnNoticiaListener){
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