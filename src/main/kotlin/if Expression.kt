fun main() {
    val nilaiTuntas = 70
    val nilai = 100
    val hasilUH: String
    hasilUH = if (nilai > nilaiTuntas) {
        "Nilai kamu $nilai, Selamat ya!"
    } else {
        "Nilai kamu $nilai, Silahkan kamu ikut remedial"
    }
    print(hasilUH)
}