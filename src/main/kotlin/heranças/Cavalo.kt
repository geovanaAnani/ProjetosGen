package heranças

open class Cavalo (
    especie: String, idade: Int, nome: String,
    ): Animal(especie,idade, nome) {

        var corDaCrista = ""

    override fun emetirSons(opc: Int){
        if (opc == 1){
        println("IIIIHIIII")}

    }
    fun correr (){
        println("O cavalo está correndo")
    }

    override fun toString(): String {
        return "---------Conheça: $nome! -------" +
                "\nEspecie: $especie" +
                "\nIdade: $idade" +
                "\nCor Da Crista: $corDaCrista" +
                "\nPorte: $porte"
    }


}