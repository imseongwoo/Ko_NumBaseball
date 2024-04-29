import NumberCheckUtil.checkGuessNumber

fun main() {
    var guess: String
    val range = (100..999)
    val answer = range.random().toString()
    println(answer)

    while (true) {
        println("서로 다른 3자리의 수를 입력하세요:")
        guess = readln()

        if (guess.length != 3) {
            println("3자리인지 확인해주세요")
            continue
        }

        if (guess.toSet().size != 3) {
            println("각 자리의 수가 서로 달라야합니다.")
            continue
        }

        val result = checkGuessNumber(answer, guess)
        println("스트라이크: ${result.first}, 볼: ${result.second}")

        if (result.first == 3) {
            println("정답!: $answer")
            break
        }
    }
}
