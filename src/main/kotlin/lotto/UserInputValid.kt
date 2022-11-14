package lotto

import java.util.regex.Pattern

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

	fun winningNumbers(numbersWithComma: String): Boolean {
		when {
			!Pattern.matches(
				Enum.Strings.REGEX.value,
				numbersWithComma
			) -> return false
			else -> {
				val numbers = numbersWithComma.split(',').map { it.toInt() }
				for (number in numbers)
					if (number !in Enum.Numbers.MIN_LOTTO_NUMBER.value..Enum.Numbers.MAX_LOTTO_NUMBER.value)
						return false
				return true
			}
		}
	}
}