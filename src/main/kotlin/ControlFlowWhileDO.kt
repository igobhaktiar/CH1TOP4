fun main(){
    val nama = listOf("martin", "bhaktiar ", "dani", "arya", "pradana")
    // kondisi akan berhenti di huruf y
    var index = 0
    while (index < nama.size && !nama[index].contains("y")){
        println(nama[index])
        index++
    }

    // apakah ada yang lebih simple lagii????
    // pakai apa??? function generator??
    nama.forEach { if (!it.contains("y")) println(it) else return@forEach }
    nama.filter { !it.contains("y") }.also { println(it) }

    // do-while
    index = 0
    do {
        println(nama[index])
        index++
    }
    while (index < nama.size && !nama[index].contains("y"))

}