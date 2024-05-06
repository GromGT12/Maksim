package by_practice.code_writing_practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TypeCasting {
    public static void main(String[] args) {
        //Widening
        byte myByte = 127;
        int myInt = myByte;
        System.out.println(myInt);

        double myDouble = myInt;
        System.out.println(myDouble);

        //Narrowing
        double Double = 10.5;
        int Int = (int) Double;
        System.out.println(Int);

        float myFloat = 10.5f;
        byte myByteTwo = (byte) myFloat;
        System.out.println(myByteTwo);

        int number = 290;
        String string = Integer.toString(number);
        System.out.println(string);

        String str = "345860";
        Long num = Long.parseLong(str);
        System.out.println(num);


        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );
        List<Integer> numbers = list.stream()
                .flatMap(Collection::stream)
                .map(i -> i + 2)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println("-----------------------------------");

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index of out");
        } finally {
            System.out.println("Some message");
        }
    }
}