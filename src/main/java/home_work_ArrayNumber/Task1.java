package home_work_ArrayNumber;

public class Task1 {
    public static void main(String[] args) {

        String[] string = new String[]{"tratata", "sea", "audi", "java", "online"};
        String s6 = "tratata";
        int len1 = s6.length();

        String str1 = "tratata";
        String str2 = "sea";
        String str3 = "audi";
        String str4 = "java";
        String str5 = "online";
        String stringAll = str1 + str2 + str3 + str4 + str5;
        int len2 = stringAll.length();

        for (int i = 0; i < string.length; i++) {
            String myInt = string[i];
        }
        System.out.println("Длина всех строк " + len2);
        System.out.println("длина символа " + "tratata = " + len1);
    }
}
