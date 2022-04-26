fun main() {
    val amount = 12345
    val tarif = 0.75
    val minTarif = 3500
    val percent = (if (amount * tarif > minTarif) amount * tarif else minTarif).toInt()
    println("При переводе $amount коп. комиссия составляет $percent коп.")
}