fun main (){

    var soma = 0

    do {
        print("Digite os numeros do seu teclado: ")
        val num = readLine()!!.toInt()
        soma += num

    }while (num != 0)

    println("A soma dos números digitados é: $soma")

}