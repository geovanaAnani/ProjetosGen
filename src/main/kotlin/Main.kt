import heranças.Cachorro
import heranças.Cavalo
import heranças.Preguica

fun main() {

    val cachorro = Cachorro("Canis",10,"Cachorro","Vira=lata")

    cachorro.corDopelo = "Branco"
    cachorro.porte= "Pequeno"
    println(cachorro)
    cachorro.emetirSons(3)
    cachorro.correr()

    println("\n")

    val cavalo = Cavalo ("Equus ferus",5,"Cavalo")

    cavalo.porte= "Grande"
    cavalo.corDaCrista = "Branca"
    println(cavalo)
    cavalo.correr()
    cavalo.emetirSons(1)
    println("\n")

    val preguica = Preguica("(Bradypus variegatus",30,"Bicho Preguiça")

    preguica.corDopelo= "Branco"
    preguica.porte= "Medio"
    println(preguica)
    preguica.subirEmArvores()
    preguica.emetirSons(2)
    println("\n")


}