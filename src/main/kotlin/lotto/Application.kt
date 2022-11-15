package lotto

import camp.nextstep.edu.missionutils.Console
import camp.nextstep.edu.missionutils.Randoms

fun main() {
    TODO("프로그램 구현")
}

fun printAndInput(order: String): String {
	val postposition = when (order) {
		Enum.UserInputWord.BUY_PRICE.order -> "을"
		Enum.UserInputWord.WINNING_NUMBER.order, Enum.UserInputWord.BONUS_NUMBER.order -> "를"
		else -> throw IllegalArgumentException(Enum.Error.INAPPROPRIATE_ORDER.words)
	}
	println("$order$postposition${Enum.UserInputWord.PLEASE_ENTER.order}")
	return Console.readLine()
}

fun issueLotto(price: Long): List<Lotto> {
	val lottoList = mutableListOf<Lotto>()
	var time = price / Enum.PriceNumbers.UNIT.value
	while (time > Enum.PriceNumbers.LONG_ZERO.value) {
		val numbers = Randoms.pickUniqueNumbersInRange(Enum.LottoNumbers.MIN.value, Enum.LottoNumbers.MIN.value, Enum.LottoNumbers.QUANTITY.value)
		lottoList.add(Lotto(numbers))
		time--
	}
	return lottoList
}

