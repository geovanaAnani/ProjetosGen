fun main (){
    var menos21=0
    var mais50=0
    var idade =0

    while (idade != 99){

        print("Digite uma idade aqui:  ")
        idade = readLine()!!.toInt()

        if (idade in 0 ..21){
            menos21++
        }else if (idade in 50 ..100){
            mais50++
        }


    }

        println("O numero de pessoas com menos de 21 anos é: $menos21. +" +
                "\n E o numero de pessoas mais de 50 anos é: $mais50")
}