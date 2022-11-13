package lotto

import camp.nextstep.edu.missionutils.Console

class PrintAndInput {
	fun buyPrice() {
		println("구입금액을 입력해 주세요.")
		Console.readLine()
	}

	fun winningNumber() {
		println("당첨 번호를 입력해 주세요.")
		Console.readLine()
	}

	fun bonusNumber() {
		println("보너스 번호를 입력해 주세요.")
		Console.readLine()
	}
}