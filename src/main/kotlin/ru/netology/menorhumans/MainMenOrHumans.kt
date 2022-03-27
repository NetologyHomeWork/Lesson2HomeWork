package ru.netology.menorhumans

fun main() {
    print("Введите количество Ваших лайков: ")
    val likes = readln()
    val endSymbol = likes[likes.length - 1]
    if (likes == "11")
        println("Ваша запись понравилась $likes людям")
    else if (endSymbol == '1')
        println("Ваша запись понравилась $likes человеку")
    else println("Ваша запись понравилась $likes людям")

}
