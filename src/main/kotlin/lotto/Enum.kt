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

	enum class PriceNumbers(val value: Long) {
		LONG_ZERO(0L),
		UNIT(1000),
	}

	enum class LottoNumbers(val value: Int) {
		MIN(1),
		MAX(45),
		QUANTITY(6)
	}

	enum class Strings(val value: String) {
		NUMBERS_WITH_COMMA_REGEX("^[0-9]{1,2},[0-9]{1,2},[0-9]{1,2},[0-9]{1,2},[0-9]{1,2}\$"),
		ONLY_NUMBER_REGEX("^[0-9]{1,2}\$")
	}

	enum class Index(val value: Int) {
		WINNING_NUMBERS(0),
		BONUS_NUMBER(1)
	}

	enum class Bonus(val value: Int) {
		INDEX(0),
		NO(5),
		YES(7)
	}
}