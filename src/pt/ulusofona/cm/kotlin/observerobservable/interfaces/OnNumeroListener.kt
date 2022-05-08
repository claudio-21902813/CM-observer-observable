package pt.ulusofona.cm.kotlin.observerobservable.interfaces

interface OnNumeroListener: Registavel {
    override fun leitorAdicionadoComSucesso()

    override fun leitorRemovidoComSucesso()

    fun onReceiveNumero(numero: Int)
}