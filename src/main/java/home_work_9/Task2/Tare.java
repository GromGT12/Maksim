package home_work_9.Task2;

/*Task 2
       * Таромат. Создайте класс Tare, в котором должны быть следующие поля: название продукта и материал. Материалов может быть 3 вида:
       * пластик, стекло, алюминий.

        Стоимость 1 тары из пластика - 10 центов, из стекла - 15 центов, из алюминия - 15 центов.
        2.1 Создайте класс таромат.
        В нем напишите метод, который будет принимать на вход массив объектов Tare, а в результате печатать в консоль чек типа:
        "Вы сдали 5 пластиковых бутылок, 2 стеклянных бутылок, 4 алюминиевых банок. Ваш чек - 140 центов (1 евро 40 центов - для продвинутых студентов)"

        Создайте класс Application, в котором создайте массив объектов Tare, объект класса таромат и вызовите на нем метод, описанный выше.

        2.2 Создайте класс Receipt (чек), в котором будет два поля: String message и int amount (ProductReceipt для продвинутых студентов)
        Пример: message = "Вы сдали 5 пластиковых бутылок, 2 стеклянных бутылок, 4 алюминиевых банок" , amount=140 (amount = 1.40 для продвинутых)
        В классе таромат напишите метод, который будет принимать на вход массив объектов Tare, а возвращать объект типа Receipt с
        заполнеными полями.

        В классе Application вызовите этов метод, а потом распечатайте полученный чек.
*/

import home_work_9.Material;

import java.util.Objects;
public class Tare {
    private String name;
    private Material material;


    public Tare(String name, Material material) {
        this.name = name;
        this.material = material;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}