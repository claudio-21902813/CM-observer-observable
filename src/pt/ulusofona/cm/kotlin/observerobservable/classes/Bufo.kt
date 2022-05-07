package pt.ulusofona.cm.kotlin.observerobservable.classes

import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNoticiaListener
import pt.ulusofona.cm.kotlin.observerobservable.interfaces.OnNumeroListener

class Bufo: Leitor("Bufo"), OnNumeroListener, OnNoticiaListener {
    override fun onReceiveNumero(numero: Int) {
        TODO("Not yet implemented")
    }

    override fun onReceiveNoticia(noticia: Noticia) {
        TODO("Not yet implemented")
    }

    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    private fun imprimeNumeros(): String {
        return "frfrrf"
    }

    private fun imprimeNoticias(): String {
        return "frfrrf"
    }

}