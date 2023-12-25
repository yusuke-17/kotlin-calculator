//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val calculator = Calculator()

    println("数値1を入力してください：")
    val num1 = readLine()?.toDouble()?:0.0
    println("数値2を入力してください：")
    val num2 = readLine()?.toDouble()?:0.0

    println("演算子(+,-,*,/)を入力してください：")
    val operator = readLine()?:""

    when(operator) {
        "+" -> {
            val result = calculator.add(num1, num2)
            println("結果:$result")
        }
        "-" -> {
            val result = calculator.sub(num1, num2)
            println("結果:$result")
        }
        "*" -> {
            val result = calculator.multiply(num1, num2)
            println("結果:$result")
        }
        "/" -> {
            val result = calculator.divide(num1, num2)
            println("結果:$result")
        }
        else -> println("無効な演算子です。")
    }
}