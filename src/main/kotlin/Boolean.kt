fun main() {
    val nilai = 89
    val A = 90
    val B = 80
    val C = 70
    val D = 60

    if (nilai>A && nilai<=100){
        println("Nilai Anda A")
    }
    else if (nilai<=A && nilai>B){
        println("Nilai Anda B")
    }
    else if (nilai<=B && nilai>C){
        println("Nilai Anda C")
    }
    else if (nilai<=C && nilai>D){
        println("Nilai Anda D")
    }
    else if (nilai<=D && nilai>=0){
        println("Nilai Anda E")
    }
    else {
        println("tidak ada peringkat")
    }
}