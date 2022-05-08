package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

data class Bufo(val nomeBufo: String): Leitor(nomeBufo), OnNumeroListener, OnNoticiaListener {

    val numeros: List<Int>
    val noticias: ArrayList<Noticia>

    init {
        numeros = ArrayList()
        noticias = arrayListOf()
    }

    override fun onReceiveNumero(numero: Int) {
        TODO("Not yet implemented")
    }

    override fun onReceiveNoticia(noticia: Noticia) {
        noticias.add(noticia)
    }

    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    fun imprimeNumeros(): String {
        return "frfrrf"
    }

    fun imprimeNoticias(): String {
        return "frfrrf"
    }

}