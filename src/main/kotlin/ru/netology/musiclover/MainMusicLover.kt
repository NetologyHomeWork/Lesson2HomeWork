package ru.netology.musiclover

fun main() {
    val isMusicLover = true
    val previousPay = 11_000

    val discount = if (previousPay <= 1_000)
        0
    else if (previousPay > 1000 && previousPay < 10_000)
        100
    else (previousPay * 0.05).toInt()
    val totalDiscount = if (isMusicLover) (discount * 0.01).toInt() + discount else discount

    println("Ваша скидка составляет $totalDiscount руб.")
}