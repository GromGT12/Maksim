package home_work_10.Task2;

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
    private boolean moving;

    public Car() {
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public void jechac() { //ехать
        if (engine.isStarted() && transmission.getBiezacyBieg() == 1 && gaz) {
            System.out.println("Автомобиль начал движение");
            int speed = 20 * transmission.getBiezacyBieg();
            System.out.println("speed: " + speed);
            moving = true;
        } else {
            System.out.println("Автомобиль не едет");
        }
    }

    public void silnikOn() {
        engine.silnikOn();
    }

    public void silnikOff() {
        engine.silnikOff();
    }


    public int zwiekszonyBieg() {
        if (moving) {
            transmission.zwiekszonybieg();
            int speed = 20 * transmission.getBiezacyBieg();
            System.out.println("speed: " + transmission.zmniejszonybieg());
            return transmission.getBiezacyBieg();
        }
        return transmission.zmniejszonybieg();
    }
    public int zmniejszonyBieg() {
        if(moving)
        return transmission.zmniejszonybieg();
        int speed = 20 - transmission.getBiezacyBieg();
        System.out.println("speed " + speed);
        return transmission.getBiezacyBieg();
    }

    public boolean pushGaz() {
        gaz = true;
        return gaz;
    }

}

