package home_work_ArrayNumber;

public class Task1 {
    public static void main(String[] args) {

        String[] string = new String[]{"tratata", "sea", "audi", "java", "online"};
        int sum = 0;

        for (int i = 0; i < string.length; i++) {
            String myString = string[i];
            System.out.printf("Строка %s это: %s", i, myString);
            System.out.println();
            System.out.println(myString.length());
            sum += myString.length();
        }
        System.out.println("Длина всех строк " + sum);
    }
}
