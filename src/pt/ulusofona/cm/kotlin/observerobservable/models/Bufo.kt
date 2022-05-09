package pt.ulusofona.cm.kotlin.observerobservable.models

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class Bufo(val nomeBufo: String): Leitor(nomeBufo), OnNumeroListener, OnNoticiaListener {

    val noticias: ArrayList<Noticia>

    init {
        numeros = arrayListOf()
        noticias = arrayListOf()
    }

    override fun onReceiveNumero(numero: Int) {
        numeros.add(numero)
    }

    override fun onReceiveNoticia(noticia: Noticia) {
        noticias.add(noticia)
    }

    fun imprimeNumeros(): String {
        return numeros.toString()
    }

    fun imprimeNoticias(): String {
        return noticias.toString()
    }

}