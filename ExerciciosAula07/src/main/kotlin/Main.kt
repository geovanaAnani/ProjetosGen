import classe.Cliente

fun main(){

 val cliente = Cliente ("Geovana")
/*
 try { val cliente = classe.Cliente ("")
 }catch (e: Exception){
  println(e.message)

 */



    println("${cliente.nome}, Digite aqui seu endereço: ")
    try {
     cliente.endereco = readLine()!!}
    catch (e: Exception){
      println(e.message)}


    println("${cliente.nome}, Digite aqui seu telefone: ")
   try {
    cliente.telefone = readLine()!!}
   catch (e: Exception){
    println(e.message)}



   cliente.addlista("macarão")
   cliente.addlista("tomate")
   cliente.addlista("salada")
   cliente.removeLista("tomate")
    println(cliente)
   cliente.listaCompras()










}









