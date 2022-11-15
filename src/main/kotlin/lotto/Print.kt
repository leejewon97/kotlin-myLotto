package lotto

import camp.nextstep.edu.missionutils.Console

class Print {
	fun andInput(order: String): String {
		val postposition = when (order) {
			Enum.UserInputWord.BUY_PRICE.order -> Enum.Strings.POSTPOSITION_TYPE1.value
			Enum.UserInputWord.WINNING_NUMBER.order, Enum.UserInputWord.BONUS_NUMBER.order -> Enum.Strings.POSTPOSITION_TYPE2
			else -> throw IllegalArgumentException(Enum.Error.INAPPROPRIATE_ORDER.words)
		}
		println("$order$postposition${Enum.UserInputWord.PLEASE_ENTER.order}")
		return Console.readLine()
	}
}