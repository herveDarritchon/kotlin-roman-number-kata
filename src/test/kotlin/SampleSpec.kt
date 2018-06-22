import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions

object RomanSpec : Spek({
    given("a number is being translated to roman number.") {
        val romanNumber = RomanNumber()
        on("number is 1 ") {
            val result = romanNumber.from(1)
            it("should return I for a call with param 1.") {
                Assertions.assertEquals("I", result)
            }
        }
        on("number is 2") {
            val result = romanNumber.from(2)
            it("should return I for a call with param 2.") {
                Assertions.assertEquals("II", result)
            }
        }
    }
})