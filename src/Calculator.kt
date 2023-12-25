class Calculator {
    fun add(num1:Double, num2:Double) : Double {
        return num1 + num2
    }

    fun sub(num1:Double, num2:Double) : Double {
        return num1 - num2
    }

    fun multiply(num1:Double, num2:Double) : Double {
        return num1 * num2
    }

    fun divide(num1:Double, num2:Double) : Double {
        if (num2 != 0.0) {
            return num1 / num2
        }
        else {
            println("0で割ることはできません。")
            return -1.0
        }
    }
}