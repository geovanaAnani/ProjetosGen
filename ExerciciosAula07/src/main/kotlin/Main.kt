import classe.Cliente

fun main(){
    val cliente = Cliente("Geovana")
    try {
 val cliente = Cliente ("Geovana")}
        catch (e: Exception){
            println(e.message)}

    println("Digite aqui seu endereço: ")
    val endereco = readLine()!!

    println("Digite aqui seu telefone: ")
    val telefone = readLine()!!


   cliente.addlista("macarão")
   cliente.addlista("tomate")
   cliente.addlista("salada")
   cliente.removeLista("tomate")
    println(cliente)
   cliente.listaCompras()

}
