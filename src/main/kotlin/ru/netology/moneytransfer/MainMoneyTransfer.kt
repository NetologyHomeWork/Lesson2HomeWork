package ru.netology.moneytransfer

const val MIN_COMMISSION = 35
const val COMMISSION_PERCENT = 0.75
const val RUBLE_TO_KOPECK = 100

fun main() {
    print("Введите сумму перевода в рублях: ")
    val amount = readln().toInt() * RUBLE_TO_KOPECK
    val commission = (amount * COMMISSION_PERCENT).toInt()
    val sum = if (commission < MIN_COMMISSION) MIN_COMMISSION else commission
    val result = amount + sum
    println("Сумма Вашего перевода вместе с комиссией составляет: ${result / RUBLE_TO_KOPECK} руб.")
}
