class Cliente01 {

    //Atributos

    var nome = ""
    var cpf = ""
    var cidade = ""
    var email = ""
    var conta = 0
    var saldo = 0.0
    var score = 500

    //Metodos
    /* Pagar dividas, solicitar emprestimo, saque, tranferencia
    saldo
     */

    fun pritSaldov (){
        println("O saldo é: $saldo")
    }

    fun pagDivi (valorD: Double){
        if (saldo <= 0) {
            println("Saldo Insuficiente para pagar conta!")
        } else if (valorD <= 0) {
            println("Valor invalido")

        } else if (valorD > saldo ){
            println("Saldo insuficiente ")
        }
        else {
            saldo -= valorD
            println("Pagamento de R$$valorD realizado com sucesso")
            println("Seu saldo agora é de: $saldo")
        }
    }

fun solictEmprest (score: Int){
    if (score in 700.. 1000 ){
        println("Separamos algumas ofertas de credito para você!")
    }else if (score in 300 .. 699 ){
        println("Iremos analisar seu perfil! Aguarde que entraremos em contato.")
    }else if (score in 0 ..299){
        println("Infelizmente não é possivel solicitar credito! " +
                "Regularize suas contas e faça uma nova solcitação em breve!")
    }
}

    fun saQue(valor: Double ) {
        if (saldo <= 0) {
            println("Saldo Insuficiente!")
        } else if (valor <= 0) {
            println("Saque impossivel de ser realizado!")

        } else if (valor > saldo ){
            println("Saldo insuficiente")
        }
        else {
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso")
            println("Seu saldo agora é de: $saldo")
    }
}
    fun tranSaldo (valor: Double ){
        if (saldo <= 0) {
            println("Saldo Insuficiente para essa transferência!")
        } else if (valor <= 0) {
            println("Tranferencia impossivel de ser realizada!")

        } else if (valor > saldo ){
            println("Saldo insuficiente")
        }
        else {
            saldo -= valor
            println("Tranferencia de R$$valor realizado com sucesso")



        }






    }}