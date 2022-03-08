package heranças

open class Animal (
    val especie: String, var idade: Int, val nome: String) {

    var cor = ""
    var porte = ""


    open fun emetirSons(opc: Int){
        println("....")
    }




}