fun main(){
    val nilai = 80
    val syaratkelulusan = 80

    if(nilai >= syaratkelulusan){
        println("Lulus")
    } else {
        println("Belum Beruntung")
    }

    println(if (nilai >= syaratkelulusan )"Lulus" else "Coba Lagi")

    val panjang = 14
    val lebar = 16
    val bentuk = if (panjang == lebar) "Persegi" else "Persgi Panjang"
    println(bentuk)
    println("Luas $bentuk adalah : ${panjang * lebar}")
}