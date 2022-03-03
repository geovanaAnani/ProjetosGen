fun main(){
    val num =  arrayOf (5, 10, 15, 20, 25)
for (i in num){
    println(i)
}

    val num2 = mutableListOf(5, 10, 15, 20, 25)

    num2.remove(5)
for (i in num2){
    println(i)
}


}