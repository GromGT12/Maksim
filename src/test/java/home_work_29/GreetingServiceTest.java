package home_work_29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GreetingServiceTest {

    @Test
    public void greet_validName_returnsGreeting() {
        //given
        GreetingService greetingService = new GreetingService();
        String name = "Pavel";
        //when
        String expected = "Приветсвую тебя, Pavel";
        //then
        String actual = greetingService.greet(name);
        assertEquals(expected, actual);
    }

    @Test
    public void greet_emptyName_throwsIllegalArgumentException() {
        //given
        GreetingService greetingService = new GreetingService();
        String name = "";
        //when
        assertThrows(IllegalArgumentException.class, () -> greetingService.greet(name));
        //then
    }

    @Test
    public void greet_nullName_throwsIllegalArgumentException() {
        //given
        GreetingService greetingService = new GreetingService();
        String name = null;
        //when
        assertThrows(IllegalArgumentException.class, () -> greetingService.greet(name));
        //then
    }
}
