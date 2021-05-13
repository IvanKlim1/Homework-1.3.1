package ru.netology

var count =20*60*60// как давно заходил пользователь в сеть в секундах
fun main() {
    agoToText()
}

fun minute() {
    val count1 = count / 60 % 10
    when {
        count > 59 && count < 6 * 60 || count > 20 * 60 && count < 60 * 60->
            if (count1 == 1) {
                count = count / 60
                println("был(а) в сети $count  минуту назад")
            } else if (count1 == 2 || count1 == 3 || count1 == 4) {
                count = count / 60
                println("был(а) в сети  $count  минуты назад")

            } else {
                count = count / 60
                println("был(а) в сети  $count  минут назад")

            }
        count > 5 * 60 && count < 21 * 60 -> {
            count /= 60

            println("был(а) в сети  $count минут назад")
        }
    }
}

fun hours() {
    val count2 = (count / 60) / 60 % 10

    when {
        count > 59 * 60 && count < 5 * 60 * 60 || count > 20 * 60 * 60 && count < 24 * 60 * 60 ->
            if (count2 == 1) {
                count = count / 60 / 60
                println("был(а) в сети  $count  час назад")
            } else if (count2 == 2 || count2 == 3 || count2 == 4) {
                count = count / 60 / 60
                println("был(а) в сети $count  часа назад")

            } else {
                count = count / 60 / 60
                println("был(а) в сети $count  часов назад")

            }

        count > 4 * 60 * 60 && count < 21 * 60 * 60 -> {
            count = count / 60 / 60

            println("был(а) в сети  $count  часов назад")
        }
    }
}

fun agoToText() {
    when {
        count in 0..59 ->
            println("был(а) в сети только что")
        count > 59 && count < 60 * 60 ->
            minute()
        count > 60 * 60 && count < 24 * 60 * 60 ->
            hours()
        count > 23 * 60 * 60 && count < 1.9 * 24 * 60 * 60 ->
            println("был(а) в сети  сегодня")
        count > 1.9 * 24 * 60 * 60 && count < 2.9 * 24 * 60 * 60 ->
            println("был(а) в сети  вчера")
        count > 2.9 * 24 * 60 * 60 ->
            println("был(а) в сети давно")

    }
}