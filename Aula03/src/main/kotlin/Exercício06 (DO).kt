fun main (){


         var mult3 =0
         var media =0.0
         var soma =0.0
         var num=0

    do {
        print("Digite um número: ")
        num = readLine()!!.toInt()

        if (num %3 == 0 && num != 0 ){
            soma += num
            mult3 ++

        }

    }while (num != 0)

    media = soma / mult3

    println("Dos números digitados, a média dos números multiplos de 3 é: $media")
}