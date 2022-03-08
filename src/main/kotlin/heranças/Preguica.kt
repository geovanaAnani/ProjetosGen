package heranças

open class Preguica (
    especie: String, idade: Int, nome: String,
): Animal(especie,idade, nome) {

    var corDopelo = ""

    override fun emetirSons(opc: Int) {
        if (opc == 2) {
            println("AAAAAAAAAAAAAAAARRNAAAARN")

        }}
        fun subirEmArvores() {
            println("A preguiça está subindo em arvores")
        }
    override fun toString(): String {
        return "---------Conheça: $nome! -------" +
                "\nEspecie: $especie" +
                "\nIdade: $idade" +
                "\nCor Do Pelo: $corDopelo" +
                "\nPorte: $porte"
    }





    }




