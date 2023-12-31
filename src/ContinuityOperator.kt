
class ContinuityOperator {
    private val calculator = Calculator()
    fun operator(): Double {

        var result: Double? = null

        while (true) {
            // 初回の数値の入力
            if (result == null) {
                println("最初の数値を入力してください: ")
                result = readLine()?.toDouble()?:0.0
            }

            println("数値を入力してください: ")
            val num = try {
                readLine()?.toDouble()?:0.0
            } catch (e: NumberFormatException) {
                println("無効な数値です。再度入力してください。")
                continue
            }

            println("演算子を入力してください (終了する場合はq): ")
            val op = try {
                readLine()?:""
            } catch (e: Exception) {
                println("無効な演算子です。再度入力してください。")
                continue
            }

            if (op == "q") {
                break
            }

            when(op) {
                "+" -> {
                    result = calculator.add(result, num)
                }
                "-" -> {
                    result = calculator.sub(result, num)
                }
                "*" -> {
                    result = calculator.multiply(result, num)
                }
                "/" -> {
                    result = calculator.divide(result, num)
                }
                else -> {
                    result = 0.0
                }
            }

            println("結果: $result")
        }

        return result ?: 0.0
    }
}