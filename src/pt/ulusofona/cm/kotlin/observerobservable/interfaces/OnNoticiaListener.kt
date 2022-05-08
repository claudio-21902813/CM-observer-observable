package pt.ulusofona.cm.kotlin.observerobservable.interfaces

import pt.ulusofona.cm.kotlin.observerobservable.models.Noticia

interface OnNoticiaListener: Registavel {
    override fun leitorAdicionadoComSucesso()

    override fun leitorRemovidoComSucesso()

    fun onReceiveNoticia(noticia: Noticia)

}