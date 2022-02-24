fun main() {
    var impar =0
    var par = 0

    for (i in 1..10) {


        print("Digite um numero:  \n")
        val num = readLine()!!.toInt()

       if (num% 2 ==0 ) {
           par++
        }else {
            impar ++

    }
}
    println("Dos numeros digitados $par são pares e $impar são impares!")
}