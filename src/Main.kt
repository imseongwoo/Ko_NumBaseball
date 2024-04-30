fun main() {
    while (true) {
        println("환영합니다! 원하시는 번호를 입력해주세요")
        println("1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기")

        when (readln()) {
            "1" -> {
                val game = NumberBaseballGame()
                game.playGame()
            }
            "2" -> {
                println("게임 기록은 아직 구현되지 않았습니다.")

            }
            "3" -> {
                println("게임을 종료합니다.")
                break
            }
            else -> println("올바른 번호를 입력해주세요.")
        }
    }
}