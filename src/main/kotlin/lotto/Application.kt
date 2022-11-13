package lotto

import camp.nextstep.edu.missionutils.Console

fun main() {
    TODO("프로그램 구현")
}

fun printAndInput(order: String): String {
	val postposition = when (order) {
		Enum.UserInput.BUY_PRICE.order -> "을"
		Enum.UserInput.WINNING_NUMBER.order, Enum.UserInput.BONUS_NUMBER.order -> "를"
		else -> throw IllegalArgumentException(Enum.UserInput.ERROR.order)
	}
	println("$order$postposition${Enum.UserInput.PLEASE_ENTER.order}")
	return Console.readLine()
}
