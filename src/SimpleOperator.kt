import java.util.Objects

class SimpleOperator {

    private val num1: Double
    private val num2: Double
    private val operator: String

    init {
        println("数値1を入力してください：")
        this.num1 = readLine()?.toDouble()?:0.0
        println("数値2を入力してください：")
        this.num2 = readLine()?.toDouble()?:0.0

        println("演算子(+,-,*,/)を入力してください：")
        this.operator = readLine()?:""
    }

    fun operator() : Double {

        val calculator = Calculator()
        val result: Double

        when(this.operator) {
            "+" -> {
                result = calculator.add(this.num1, this.num2)
            }
            "-" -> {
                result = calculator.sub(this.num1, this.num2)
            }
            "*" -> {
                result = calculator.multiply(this.num1, this.num2)
            }
            "/" -> {
                result = calculator.divide(this.num1, this.num2)
            }
            else -> {
                result = 0.0
            }
        }

        return result
    }
}