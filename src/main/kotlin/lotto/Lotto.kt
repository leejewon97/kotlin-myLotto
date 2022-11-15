package lotto

import camp.nextstep.edu.missionutils.Randoms

class Lotto(private val numbers: List<Int>) {
	init {
		require(numbers.size == 6)
	}

	// TODO: 추가 기능 구현
	fun getNumbers(): List<Int> {
		return numbers
	}

	fun issue(price: Long): List<Lotto> {
		val lottoList = mutableListOf<Lotto>()
		var time = price / Enum.Price.UNIT.value
		while (time > Enum.Price.LONG_ZERO.value) {
			val numbers = Randoms.pickUniqueNumbersInRange(
				Enum.LottoNumber.MIN.value,
				Enum.LottoNumber.MAX.value,
				Enum.LottoNumber.QUANTITY.value
			)
			lottoList.add(Lotto(numbers))
			time--
		}
		return lottoList
	}
}
