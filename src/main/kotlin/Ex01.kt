fun main() {

    val cliente = Cliente01()

    cliente.nome = "Larissa Fernandes"
    cliente.cpf = "354.564.350-63"
    cliente.cidade = "Campinas"
    cliente.email = "larissa.fernandes001@gmail.com"
    cliente.conta = 1
    cliente.saldo = 5000.0
    cliente.score = 500

    /*
    pritSaldov
pagDivi
solictEmprest
saQue
tranSaldo
     */

    println("Bem vinda, ${cliente.nome}!")
    println("-------------------------")
    println("----------Menu-----------")
    println("1- SALDO" +
            "\n2- PAGAR CONTAS" +
            "\n3- SAQUE" +
            "\n4- TRANFERENCIA" +
            "\n5- SOLICITAR CREDITO" +
            "\n6- SAIR")

    println("Digite a opção desejada: ")
    val opc = readLine()!!.toInt()

    when (opc) {

        1-> {
            cliente.pritSaldov()
        }
        2->{
            println("Digite o valor da conta: ")
            val contav = readLine()!!.toDouble()

            cliente.pagDivi(contav)
        }
        3-> {
            println("Digite o valor do saque: ")
            val saque = readLine()!!.toDouble()
            cliente.saQue(saque)

        }
        4->{
            println("Digite o valor da Tranferencia: ")
            val tranf = readLine()!!.toDouble()

            cliente.tranSaldo(tranf)
        }
        5->{
            cliente.solictEmprest(500)
        }
        6->{
            println("Agradecemos sua presença! Até logo! ")
        }
    }








}