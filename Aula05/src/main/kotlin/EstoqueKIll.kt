fun main (){
    val estoque = mutableListOf<String>()

    while (true) {

        println("\n----Estoque----\n"+
        "\n1 - Adicionar itens" +
        "\n2 - Remover itens " +
        "\n3 - Atualizar itens" +
        "\n4 - Listar itens" +
        "\n5 - Sair")

        println("\nDigite uma opção: ")
        val menu = readLine()!!.toInt()

        when(menu){

            1 -> {
                print("Digite um item para ser adicionado no estoque: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Valor inválido")
                }else{
                    estoque.add(item)
                    println("Item inserido com sucesso!")
                }
            }

            2 -> {
                print("Digite um item para ser removido do estoque: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Valor inválido")
                }else{
                    if(estoque.contains(item)){
                        estoque.remove(item)
                        println("O item $item foi removido com sucesso")
                    }else{
                        println("O item $item não existe na lista")
                    }
                }
            }

            3 -> {
                print("\nDigite o produto que será atualizado: ")
                val item = readLine()!!

                if(item.isEmpty()){
                    println("Valor inválido")
                }else{

                    if(estoque.contains(item)){

                        val posItem = estoque.indexOf(item)

                        println("Digite o novo item: ")
                        val itemNovo = readLine()!!

                        if(itemNovo.isEmpty()){
                            println("Valor inválido")
                        }else{
                            estoque[posItem] = itemNovo
                            println("Item atualizado com sucesso!")
                        }

                    }else{
                        println("O item $item não existe na lista!")
                    }

                }

            }

            4 -> {
                if(estoque.isEmpty()){
                    println("O estoque está vazio")
                }else{
                    println("***Itens do Estoque***")

                    estoque.forEach {
                        println(it)
                    }

                }
            }

            else -> break

        }

    }


}