package org.example;

class famali {
    /* Мама мыла раму
 Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
 Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
 МылаРамуМама
 РамуМамаМыла
 ...
 */
     public static void main(String[] args) {
         String s1 = "Mama";
         String s2 = "Father";
         String s3 = "Sister";

         System.out.println(s1+s2+s3);
         System.out.println(s2+s1+s3);
         System.out.println(s3+s1+s2);
         System.out.println(s2+s3+s1);
         System.out.println(s3+s2+s1);
     }
 }

 class Tii {
     /* Семь цветов радуги
 Выведи на экран текст - семь цветов радуги.
 В каждой строке должно быть по три цвета, в последней - один.
 Цвета в строках разделяй пробелом.
 Запомни: буквы Ё в тестах нигде нет.
 Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
 */
    public static void main(String[] args) {
        System.out.println("Синий Красный Желтый");
        System.out.println("Зеленый Синий Голубой");
        System.out.println("Фиолетовый");
    }
}

