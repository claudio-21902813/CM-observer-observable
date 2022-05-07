package pt.ulusofona.com.kotlin.observerobservable.interfaces

import pt.ulusofona.com.kotlin.observerobservable.classes.Noticia

interface OnNoticiaListener: Registavel {
    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    fun onReceiveNoticia(noticia: Noticia)
}