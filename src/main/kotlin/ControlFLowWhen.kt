fun main(){
    // kondisi penilaian seorang karyawan
    // terdapat nilai dari 1 - 5 dengan kondisi
    // 1-2 Bad
    // 3 Cukup
    // 4 Baik
    // 5 Superb

    val penilaianKaryawan = 1
    when (penilaianKaryawan) {
        1 -> println("Bad")
        2 -> println("Bad")
        3 -> println("Cukuup")
        4 -> println("Baik")
        5 -> println("Superb")
        else -> {}
    }

    // apakah bisa diimprove penulisan code nya???
    when (penilaianKaryawan) {
        in 1..2 -> println("Bad")
        3 -> println("Cukuup")
        4 -> println("Baik")
        5 -> println("Superb")
        else -> {}
    }
    // apakah dari contoh diatas bisa di sederhanakan kembali?
    println(
        when (penilaianKaryawan) {
            in 1..2 -> "Bad"
            3 -> "Cukuup"
            4 -> "Baik"
            5 -> "Superb"
            else -> ""
        }
    )

    /// 0-10, 11-30, 31-50, 50-75, 76-90, 91-100
    val contohLain = when (100) {
        in 0..10 -> ""
        in 11..30 -> ""
        in 31..50 -> ""
        in 51..75 -> ""
        in 76..90 -> ""
        in 91..100 -> {
            "mencetak sempurna"
            "Perfect"
        }
        else -> ""
    }
    println(contohLain)
}