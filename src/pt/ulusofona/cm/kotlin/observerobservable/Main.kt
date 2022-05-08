package pt.ulusofona.cm.kotlin.observerobservable

import pt.ulusofona.cm.kotlin.observerobservable.models.Bufo
import pt.ulusofona.cm.kotlin.observerobservable.models.CorreioDaLusofona
import pt.ulusofona.cm.kotlin.observerobservable.models.LeitorPar
import pt.ulusofona.cm.kotlin.observerobservable.models.Noticia


fun main() {

    val listaNoticias = arrayListOf<Noticia>(
        Noticia("Noticia 1","algo..."),
        Noticia("Noticia 2","algo..."),
        Noticia("Noticia 3","algo...")
    )

    val bufo = Bufo("Bufffofo")
    val correioDaLusofona = CorreioDaLusofona(12, listaNoticias)
    correioDaLusofona.adicionarLeitor(bufo)
    correioDaLusofona.iniciar()

    println(bufo.noticias)
}