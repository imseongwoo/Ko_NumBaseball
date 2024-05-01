import util.GameRecord
import util.NumberCheckUtil.checkGuessNumber

class NumberBaseballGame {
    private val answer: String = generateRandomNumber()
    private var attempts = 0

    private fun generateRandomNumber(): String {
        while (true) {
            val potentialAnswer = (100..999).random().toString()
            if (potentialAnswer.toSet().size == 3) {
                return potentialAnswer
            }
        }
    }

    fun playGame() {
        println("< 게임을 시작합니다 >")
        while (true) {
            println("서로 다른 3자리의 수를 입력하세요:")
            val guess = readln()
            attempts++

            if (!isValidGuess(guess)) {
                println("3자리인지 확인해주세요, 각 자리의 수가 서로 달라야합니다.")
                continue
            }

            val (strikes, balls) = checkGuessNumber(answer, guess)
            if (strikes == 0 && balls == 0 ) {
                println("Nothing")
            } else {
                println("스트라이크: $strikes, 볼: $balls")
            }

            if (strikes == 3) {
                println("정답!: $answer")
                GameRecord.recordGame(attempts)
                break
            }
        }
    }

    private fun isValidGuess(guess: String): Boolean {
        return guess.length == 3 && guess.toSet().size == 3
    }
}