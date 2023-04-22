package home_work_23.Package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAnnotationValidatorTest {
    MyAnnotationValidator target = new MyAnnotationValidator();

    @Test
    void shouldNotException_whenObjectIsValid() {
        //given
        AccountInformation validInformation = new AccountInformation("Andrey", "Petrov", "Petrov@mail.com", "234567890");
        //when
        assertDoesNotThrow(() -> target.validate(validInformation));
        //then

    }

    @Test
    void shouldThrowException_whenNameInValid() {
        //given
        AccountInformation invalidNameInfo = new AccountInformation("124Andrey", "Petrov", "Petrov@mail.com", "234567890");
        String expectedMessage = "Field name with value 124Andrey can contain only letters";

        //when
        PingwitValidationException annotationsException = assertThrows(PingwitValidationException.class, () -> target.validate(invalidNameInfo));

        //then
        String actualMessage = annotationsException.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
