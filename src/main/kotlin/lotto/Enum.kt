package lotto

class Enum {
	enum class UserInputWord(val order: String) {
		BUY_PRICE("구입금액"),
		WINNING_NUMBER("당첨 번호"),
		BONUS_NUMBER("보너스 번호"),
		PLEASE_ENTER(" 입력해 주세요.")
	}

	enum class Error(val words: String) {
		INVALID_NUMBER("[ERROR] invalid number input"),
		INAPPROPRIATE_ORDER("[ERROR] inappropriate order"),
	}

	enum class Numbers(val value: Long) {
		LONG_ZERO(0L),
		UNIT(1000)
	}
}