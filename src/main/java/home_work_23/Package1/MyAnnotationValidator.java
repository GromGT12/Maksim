package home_work_23.Package1;

import home_work_23.Package2.OnlyDigits;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public class MyAnnotationValidator {
    private static final Pattern ONLY_NAME_VALIDATION = Pattern.compile(("^[a-zA-Z]*$"));
    private static final Pattern ONLY_EMAIL_VALIDATION = Pattern.compile("([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
    private static final Pattern ONLY_DIGITS_VALIDATION = Pattern.compile("[0-9]+$");

    public void validate(Object obj) {
        for (Field declaredField : obj.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);

            for (Annotation annotation : declaredField.getAnnotations()) {
                if (annotation.annotationType().equals(LettersOnly.class)) {
                    try {
                        String value = (String) declaredField.get(obj);
                        if (ONLY_NAME_VALIDATION.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s can contain only letters", declaredField.getName(), value);

                            throw new PingwitValidationException(message);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (annotation.annotationType().equals(Email.class)) {
                    try {
                        String value = (String) declaredField.get(obj);
                        if (!ONLY_EMAIL_VALIDATION.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s can contain @email ", declaredField.getName(), value);

                            throw new PingwitValidationException(message);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (annotation.annotationType().equals(OnlyDigits.class)) {
                    try {
                        String value = (String) declaredField.get(obj);
                        if (ONLY_DIGITS_VALIDATION.matcher(value).matches()) {
                            String message = String.format("Field %s with value %s can contain only digits", declaredField.getName(), value);

                            throw new PingwitValidationException(message);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

