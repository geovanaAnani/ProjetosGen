package heranças

open class Cachorro (
    especie: String, idade: Int, nome: String, val raça: String
): Animal(especie,idade, nome) {

    var corDopelo = ""

    override fun emetirSons(opc: Int){
        if (opc == 3) {
            println("AUAUAUAUAUAUAUAUA ERRRRRNN")
        }
    }
    fun correr (){
        println("O Cachorro esta correndo")
    }

    override fun toString(): String {
        return "---------Conheça: $nome! -------" +
                "\nEspecie: $especie" +
                "\nRaça: $raça"+
                "\nIdade: $idade" +
                "\nCor Do Pelo: $corDopelo" +
                "\nPorte: $porte"
    }

}
