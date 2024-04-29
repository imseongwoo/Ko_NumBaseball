object NumberCheckUtil {
    fun checkGuessNumber(answer: String, guess: String): Pair<Int, Int> {
        var strikes = 0
        var balls = 0

        guess.forEachIndexed { index, char ->
            if (char == answer[index]) {
                strikes++
            } else if (char in answer) {
                balls++
            }
        }

        return Pair(strikes, balls)
    }
}