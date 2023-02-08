package home_work_5;

class Task5 {
    static class Invert {
        public static void main(String[] args) {

            // reverseArray2 - не совсем подходящее название. лучше arrayToReverse или что-то подобное
            double[] reverseArray2 = {1.2, 1.9, 11.4, 23.8};
            // "\n2. - мне кажется, это не нужно выводить
            System.out.print("\n2. Массив в обратном порядке: ");
            for (int i = reverseArray2.length - 1; i >= 0; i--) {
                // получается, что мы просто выводим содержимое исходного массива в обратном порядке.
                // сделай плиз новый массив, который будет хранить значения старого, только в обратном порядке, и выведи этот новый массив
                System.out.print(reverseArray2[i] + " ");
            }
        }
    }
}
