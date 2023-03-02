package Task2;

/*
Есть класс автомобиль. У автомобиля есть коробка передач и мотор.
У мотора должны быть методы “заглушить мотор” и “завести мотор”.
Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен

У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
Нельзя понизить передачу ниже 0 и повысить больше 7.

в классе main реализация
- Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
- Машина не может поехать, если не заведен мотор.
- Когда машина едет, то пускай выведет на экран текущую скорость

Скорость = текущая_передача * 20

 */

public class Car {
    private Engine engine;
    private Transmission transmission;
    private boolean gaz;


    public void jechac() { //ехать
        if(engine.isAction()&& transmission.isJedynkaBiezacyBieg() && gaz)
        System.out.println("Автомобиль начал движение");
    }
    public void SilnikOn() {
        engine.SilnikOn();
    }

    public void SilnikOff() {
        engine.SilnikOff();
    }

    public int zwiekszonybieg() {
        return transmission.zwiekszonybieg();
    }

    public int zmniejszonybieg() {
        return transmission.zmniejszonybieg();

    }

    public boolean isGaz() {
        gaz = true;
        return gaz;
    }
}
