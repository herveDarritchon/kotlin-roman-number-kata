class RomanNumber {

    fun from(number: Int): String {
        return when {
            number == 1 -> "I"
            number < 4 -> from(1) + from(number - 1)
            number == 4 -> from(1) + from(number + 1)
            number == 5 -> "V"
            number < 9 -> from(5) + from(number - 5)
            number == 9 -> from(1) + from(number + 1)
            number == 10 -> "X"
            number < 40 -> from(10) + from(number - 10)
            else -> "I" + from(number - 1)
        }
    }


}
