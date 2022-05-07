package pt.ulusofona.cm.kotlin.observerobservable.interfaces

interface OnNumeroListener: Registavel {
    override fun leitorAdicionadoComSucesso() {
        TODO("Not yet implemented")
    }

    override fun leitorRemovidoComSucesso() {
        TODO("Not yet implemented")
    }

    fun onReceiveNumero(numero: Int)
}