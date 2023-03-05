package home_work_11.Task2;

import home_work_11.Task1.AbstractPhone;
import home_work_11.Task1.SmartPhone;

public class Phone {
    public static void main(String[] args) {
        AbstractPhone abstractPhone4 = new SmartPhone("iphone SE 2020:");

        // все хорошо
        char[] chars = new char[]{'M', 'a', 'k', 's', 'y', 'm'};
        String fromChars = String.valueOf(chars);
        System.out.println(fromChars);

        String format = String.format("У меня в руках iPhone, %s. Модель SE 2020", abstractPhone4.getName());
        System.out.println(format);

        // плиз, переменные назвай с маленькой буквы
        String Upper = "PingWit";
        String Lower = "pingWit";
        System.out.println(Upper.equals(Lower));

        String a = "MAKSYM".toLowerCase();
        String b = "maksym".toUpperCase();
        System.out.println(a);
        System.out.println(b);

        // плиз сделай название переменной покороче
        String hellodarknessmyoldfriendspace = "  _hello darkness my old friend_ ";
        String strip = hellodarknessmyoldfriendspace.strip();
        System.out.println(strip);

        String myFontello = "";
        String myFontello2 = " "; //я тут делаю без пробела и все равно true
        System.out.println(myFontello.isEmpty());
        System.out.println(myFontello2.isBlank());
    }
}
