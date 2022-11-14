package lotto

class UserInputValid {
	fun buyPrice(anyPrice: String): Boolean {
		val price: Long
		try {
			price = anyPrice.toLong()
		} catch (e: NumberFormatException) {
			throw IllegalArgumentException(Enum.Error.INVALID_NUMBER.words)
		}
		return when {
			price >= Enum.Numbers.LONG_ZERO.value -> false
			(price % Enum.Numbers.UNIT.value) != Enum.Numbers.LONG_ZERO.value -> false
			else -> true
		}
	}
}