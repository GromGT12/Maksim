package home_work_6;

import java.util.Arrays;

class ArrayForHuman {
    public static void main(String[] args) {
        Human maks = new Human("Maks", 30);
        Human bob = new Human("Bob", 25);
        Human[] humans = new Human[]{maks, bob};
        Human human = new Human();
        human.text = "Text";
        System.out.println(maks.text);
        System.out.println(bob.text);
        String text = Human.text;
        System.out.println(Arrays.toString(humans));
    }
}
