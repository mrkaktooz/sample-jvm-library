import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GreetingTest{
    @Test
    fun execute(){
        assertEquals("Hello from java library", Greeting().execute())
    }
}