fun main() {
    val panjang = "20"
    val lebar   = 12.6
    val tinggi  = 10
    val volume  : Double = hitungVolume(panjang.toDouble(), lebar, tinggi.toDouble()).toDouble();
    // to Do
    println("Volume balok yang panjangnya $panjang, lebarnya $lebar, dan tingginya $tinggi ini adalah $volume")
}
fun hitungVolume(p:Double, l:Double, t:Double) : Float{
    val v = p*l*t
    //to Do
    return  v.toFloat()
    }

