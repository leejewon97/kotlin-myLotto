package lotto

class Enum {
	enum class UserInput(val order: String) {
		BUY_PRICE("구입금액"),
		WINNING_NUMBER("당첨 번호"),
		BONUS_NUMBER("보너스 번호"),
		ERROR("[ERROR] inappropriate order"),
		PLEASE_ENTER( " 입력해 주세요.")
	}
}