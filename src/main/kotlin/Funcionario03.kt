class Funcionario {

    //Atributos
    var nome = ""
    var setor = ""
    var salario = 0.0
    var rg=""
    var cpf =""

    //Métodos
    //trabalha
    //recebe

    override fun toString(): String {
        return "\nNome: $nome" +
                "\nRg: $rg" +
                "\nCPF: $cpf" +
                "\nSetor: $setor" +
                "\nSalario: $salario"


    }

fun trabalhaH (){
   val horas = (8*5)*4
    println("Você trabalha $horas horas por mês!")

}
fun recebe (){
    val dia = salario/20
    val valor = 250.0*20.0
    println("Você ganha $dia reais por dia e recebe $valor por mês!")
}



}