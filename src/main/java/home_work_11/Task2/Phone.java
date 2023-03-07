package home_work_11.Task2;

import home_work_11.Task1.AbstractPhone;
import home_work_11.Task1.SmartPhone;

// называть классы по сути
public class Phone {
    public static void main(String[] args) {
        AbstractPhone abstractPhone4 = new SmartPhone("iphone SE 2020:");

        // все хорошо
        char[] chars = new char[]{'M', 'a', 'k', 's', 'y', 'm'};
        String fromChars = String.valueOf(chars);
        System.out.println(fromChars);

        String format = String.format("У меня в руках iPhone, %s.", abstractPhone4.getName());
        String.format("У меня в руках iPhone, %s. цена: %d", abstractPhone4.getName(), 12);
        System.out.println(format);

        // плиз, переменные назвай с маленькой буквы
        String upper = "PingWit";
        String lower = "pingWit";
        System.out.println(upper.equals(lower));

        String a = "MAKSYM".toLowerCase();
        String b = "maksym".toUpperCase();
        System.out.println(a);
        System.out.println(b);

        // плиз сделай название переменной покороче
        String smilespace = "  _hello darkness my old friend_ ";
        String strip = smilespace.strip();
        System.out.println(strip);

        String myFontello = " ";
        String myFontello2 = " ";
        System.out.println(myFontello.isEmpty());
        System.out.println(myFontello2.isBlank());
    }
}
