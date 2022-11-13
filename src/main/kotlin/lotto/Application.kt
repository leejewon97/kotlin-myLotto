package lotto

import camp.nextstep.edu.missionutils.Console

fun main() {
    TODO("프로그램 구현")
}

fun printAndInput(what: String): String {
	val postposition = when (what) {
		"구입금액" -> "을"
		"당첨 번호", "보너스 번호" -> "를"
		else -> throw IllegalArgumentException("[ERROR] inappropriate order")
	}
	println("$what$postposition 입력해 주세요.")
	return Console.readLine()
}
