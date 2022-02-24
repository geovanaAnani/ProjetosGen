fun main(args: Array<String>) {

    /*
    Estruturas de Repetição

    while (ou seja, enquanto) - Looping que só vai ser executado se a condição for verdadeira

    while(condicao){

        bloco que vai se repetir

    }

    do...while (ou seja, faça...enquanto) - Looping que vai ser executado pelo
    menos uma vez, independente da condição

    do{

        Bloco que vai ser executado pelo menos uma vez e rodára em looping se a
        condição for verdadeira

    }while(condicao)

    for (ou seja, para) - Vai repetir o bloco de códigos pegando a referência de uma
    variável de controle

    Exemplo para do Portugol
    para(inteiro i = 0; i < 10; i++){

    }

    Exemplo for no Kotlin - Estrutura

    for(variavel range passos){

        Bloco que vai se repetir

    }

    for(i in 1..10 step 4){

    }

     */

    //Exemplo prático do while

    /*
    var soma = 0
    var num = 5

    while (num != 0){

        print("Digite um número diferente de 0: ")
        num = readLine()!!.toInt()

        soma += num

    }

    println("A soma de todos os números digitados é $soma")
     */

    //Exemplo prático do...while

    /*
    do{

        print("Tem o Pete e o Repete, o Pete morreu, quem sobrou?")
        val resp = readLine()!!

    }while(resp == "Repete" || resp == "repete")
     */

    /*
    print("Digite um valor para calcularmos a sua tabuada: ")
    val tab = readLine()!!.toInt()

    for(i in 1..10){

        println("$tab * $i = ${tab * i}")

    }
     */

    //Exemplo louco que meus alunos pediram

    /*
    var passo = 2

    for (i in 1..20 step passo){

        println("$i")

        if(i == 9){
            passo = 3
            for(i in 10..20 step passo){
                println("$i")
            }
            break
        }
    }
     */

    //num1..num2 -> num1 downTo num2

    /*
    print("Digite um valor para calcularmos a sua tabuada: ")
    val tab = readLine()!!.toInt()

    for(aux in 10 downTo 1){

        println("$tab * $aux = ${tab * aux}")

    }
     */

}