package home_work_9;

import home_work_9.Task2.Tare;
/*Task 2
       * Таромат. Создайте класс Tare, в котором должны быть следующие поля: название продукта и материал. Материалов может быть 3 вида:
       * пластик, стекло, алюминий.

        Стоимость 1 тары из пластика - 10 центов, из стекла - 15 центов, из алюминия - 15 центов.
        2.1 Создайте класс таромат.
        В нем напишите метод, который будет принимать на вход массив объектов Tare, а в результате печатать в консоль чек типа:
        "Вы сдали 5 пластиковых бутылок, 2 стеклянных бутылок, 4 алюминиевых банок. Ваш чек - 140 центов (1 евро 40 центов - для продвинутых студентов)"

        Создайте класс Application, в котором создайте массив объектов Tare, объект класса таромат и вызовите на нем метод, описанный выше.

        2.2 Создайте класс Receipt (чек), в котором будет два поля: String message и int amount (BigDecimal для продвинутых студентов)
        Пример: message = "Вы сдали 5 пластиковых бутылок, 2 стеклянных бутылок, 4 алюминиевых банок" , amount=140 (amount = 1.40 для продвинутых)
        В классе таромат напишите метод, который будет принимать на вход массив объектов Tare, а возвращать объект типа Receipt с
        заполнеными полями.

        В классе Application вызовите этов метод, а потом распечатайте полученный чек.
*/

public class TaroMat {
    public void printCheck(Tare[] tares) {
        int plastic = 10;
        int glass = 15;
        int aluminium = 15;
        int sum = 0;

        int plasticNumber = 0;
        int glassNumber = 0;
        int aluminiumNumber =0;

        for(int i =0; i<tares.length;i++) {
            Tare tare = tares[i];
            if (Material.PLASTIC.equals(tare.getMaterial())) {
                sum += plastic;
                plasticNumber++;
            }
            if (Material.ALUMINIUM.equals(tare.getMaterial())) {
                sum += aluminium;
                aluminiumNumber++;
            }
            if (Material.GLASS.equals(tare.getMaterial())) {
                sum += glass;
                glassNumber++;
            }
        }

        System.out.println("Вы сдали пластиковых бутылок: "
                + plasticNumber + ", стеклянных бутылок: " + glassNumber +
                ",  алюминиевых банок: " +aluminiumNumber + ". Ваш чек: " + sum);
    }

}










