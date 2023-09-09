fun main(){
    // deret bilangan maksimal

    for(hasil in 0..10 step 2){
        println(hasil)
    }

    for(hasil in 10 downTo 0 step 2){
        println(hasil)
    }

    // deret bilangan genap dengan dimulai dari 0 dan maksimal 10
    // for (hasil = 0; hasil <= 10; hasil += 2)
    for (hasil in 0..10 step 2) {
        println(hasil)
    }
    // bagaimana cara membuat hitungan mundur
    // dari 10 sampai 0
    for (hasil in 10 downTo 0 step 2) {
        println(hasil)
    }

    // mencetak semua isi di dalam list
    for (hasil in listOf("Persegi",  "Lingkaran")) {
        println(hasil)
    }
    // apakah ada cara singkat lagi dari contoh list
    // pakai function generator??? library function????
    listOf("Persegi",  "Lingkaran").forEach { println(it) }

    val rows = 10

    for (i in rows downTo 1){
        for (j in 1..i){
            print("* ")
        }
        println()
    }

    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ") // Mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1..2 * i - 1) {
            print("*") // Mencetak bintang pada setiap baris
        }

        println() // Pindah ke baris berikutnya
    }
    val rows2 = 9
    for (i in rows2 downTo 1) {
        for (j in 1..rows - i) {
            print(" ") // Mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1..2 * i - 1) {
            print("*") // Mencetak bintang pada setiap baris
        }

        println() // Pindah ke baris berikutnya
    }

}