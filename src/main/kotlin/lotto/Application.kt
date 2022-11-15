package lotto

fun main() {
//	TODO("프로그램 구현")
}

fun countWinningByRank(calculateWinnings: List<Int>): Map<Int, Int?> {
	val countWinnings = mutableMapOf<Int, Int?>()
	for (key in Enum.Rank.MIN.value..Enum.Rank.MAX.value)
		countWinnings[key] = Enum.Rank.INIT.value
	for (calculateWinning in calculateWinnings) {
		countWinnings[calculateWinning] = countWinnings[calculateWinning]?.plus(Enum.Rank.COUNT.value)
	}
	return countWinnings.toMap()
}
