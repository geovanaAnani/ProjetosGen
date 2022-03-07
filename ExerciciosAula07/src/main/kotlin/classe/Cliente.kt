package classe

data class Cliente constructor(val nome : String) {

    //Atributos


     var endereco = ""
     var telefone = ""
    var listaDeCompras = mutableListOf<String>()


     init {
         if(nome.isEmpty()){
             throw Exception("Classe sendo instanciada de maneira incorreta!")
         }else{
             println("Classe instanciada!")
         }

     }


    //Metodos
    /* adicianar, remover, listar intens
     */

    constructor( nome: String, endereco: String)
            : this(nome) {
        this.endereco = endereco


    }

     constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco) {

        this.telefone = telefone
    }

    fun addlista (i: String){
        if (i.isEmpty()){
            println("Esse item esta vazio")
        }else {
            listaDeCompras.add(i)
            println("Item $i adicionado com sucesso!")
        }
    }
     fun removeLista (i: String) {
         if (i.isEmpty()){
         println("Esse item esta vazio")
     }else {
         listaDeCompras.remove(i)
         println("Item $i removido com sucesso!")
     }
   }

     fun listaCompras (){
         if (listaDeCompras.isEmpty()){
         println("Sua lista ainda esta vazia!")
         }
         else {
         println(listaDeCompras) }
     }

     override fun toString(): String {
         return "------Lista.Extrato------" +
                 "\nclasse.Cliente: $nome" +
                 "\nEndereço: $endereco" +
                 "\nTelefone: $telefone" +
                 "\n" +
                 "---------Lista----------"
     }





 }