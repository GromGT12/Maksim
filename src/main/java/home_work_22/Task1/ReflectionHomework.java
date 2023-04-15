package home_work_22.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class ReflectionHomework {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        PersonalInfo personalInfo = new PersonalInfo("Ivan", "Petrov", 53, true);
        Class<? extends PersonalInfo> clazz = personalInfo.getClass();
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        PersonalInfo reflectionPersonalInfo = null;
        for (Constructor<?> decraredConstructor : declaredConstructors) {
            if (decraredConstructor.getParameterCount() == 0) {
                reflectionPersonalInfo = (PersonalInfo) decraredConstructor.newInstance();

                Field[] declaredFields = clazz.getDeclaredFields();
                for (Field declaredField : declaredFields) {
                    declaredField.setAccessible(true);
                    System.out.printf("Field %s has type %s", declaredField.getName(), declaredField.getType().getName());
                    System.out.println();

                    if (declaredField.getName().equals("name")) {
                        declaredField.set(reflectionPersonalInfo, "Dima");
                    }
                    if (declaredField.getName().equals("surname")) {
                        ;
                        declaredField.set(reflectionPersonalInfo, "Hladyshev");
                    }
                    if (declaredField.getName().equals("age")) {
                        declaredField.set(reflectionPersonalInfo, 30);

                    }
                    if (declaredField.getName().equals("isMarried")) {
                        declaredField.set(reflectionPersonalInfo, false);
                    }

                }

                System.out.println(reflectionPersonalInfo);
            }
        }
    }
}

