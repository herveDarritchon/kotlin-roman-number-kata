/**
 * Created by Hervé Darritchon on 19/06/2018.
 *
 */
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

/**
 * Created by Hervé Darritchon on 18/06/2018.
 */
class SampleTest {


    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAllTestCases() {
            println("Runs once before all test cases.")
        }

        @AfterAll
        @JvmStatic
        fun afterAllTestCases() {
            println("Runs once after all test cases.")
        }
    }

    private val romanNumber = RomanNumber()

    @Test
    fun shouldReturnIWhenAskedFrom1() {
        assertEquals("I", romanNumber.from(1))
    }

    @Test
    fun shouldReturnIIWhenAskedFrom2() {
        assertEquals("II", romanNumber.from(2))
    }

    @Test
    fun shouldReturnIIIWhenAskedFrom3() {
        assertEquals("III", romanNumber.from(3))
    }

    @Test
    fun shouldReturnVWhenAskedFrom5() {
        assertEquals("V", romanNumber.from(5))
    }

    @Test
    fun shouldReturnIVWhenAskedFrom4() {
        assertEquals("IV", romanNumber.from(4))
    }

    @Test
    fun shouldReturnXVWhenAskedFrom10() {
        assertEquals("X", romanNumber.from(10))
    }

    @Test
    fun shouldReturnIXVWhenAskedFrom9() {
        assertEquals("IX", romanNumber.from(9))
    }

    @Test
    fun shouldReturnVIWhenAskedFrom6() {
        assertEquals("VI", romanNumber.from(6))
    }

    @Test
    fun shouldReturnXVIWhenAskedFrom16() {
        assertEquals("XVI", romanNumber.from(16))
    }
}