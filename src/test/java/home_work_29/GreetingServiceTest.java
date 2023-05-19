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
        String expected = "Приветсвую тебя, Pavel";
        // здесь также можно проверить сообщение, с который был брошен экспешен
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> greetingService.greet(name));
        //then
        assertEquals(actual.getMessage(), "имя не может быть пустой строкой");
    }

    @Test
    public void greet_nullName_throwsIllegalArgumentException() {
        //given
        GreetingService greetingService = new GreetingService();
        String name = null;
        //when
        String expected = "Приветсвую тебя, Pavel";
        // здесь также можно проверить сообщение, с который был брошен экспешен
        assertThrows(IllegalArgumentException.class, () -> greetingService.greet(name));
        //then
    }
}
