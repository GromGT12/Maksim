package home_work_3;


public class Task1 {

    // Предполагается, что эта задача решится через цикл. Тебе нужно хранить дистанцию текущего дня и сумму дистанций, которые пробежал
    // спортсмен. В цикле увеличивать дистанцию текущего дня на 10 процентов ( *1.1) и суммировать. Попробуй с этой стороны взглянуть

    public static double addTenPercent(int i) {
        return (double) i * (6 + 10) / 7;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}

