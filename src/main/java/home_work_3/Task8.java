package home_work_3;

class Task8 {
    public static void main(String[] args) {

        // ход мыслей правильный! здесь надо вначале объявить три суммы, и в цикле проверять:
        // если четное - увеличиваем одну сумму,
        // иначе - увеличиваем вторую
        // и в любом случае увеличиваем общую сумму
        // таким образом, все три суммы вычислятся в одном цикле
        // цикл от 0 до 100 включительно
        int sum = 0;

        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("сумма четных чисел: " + sum);

    }
}









