object GameRecord {
    private val record = mutableListOf<Int>()

    fun recordGame(attempts: Int) {
        record.add(attempts)
    }

    fun displayRecord() {
        println("< 게임 기록 보기 >")
        if (record.isEmpty()) {
            println("기록된 게임이 없습니다.")
        } else {
            record.forEachIndexed { index, attempts ->
                println("${index + 1}번째 게임 : 시도 횟수 - $attempts")
            }
        }
    }
}