package home_work_5;

import java.util.Arrays;


import java.util.Arrays;
class Task3 {
        public static void main(String[] args) {
            int [] mas = new int[8];

            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int)(Math.random()*10)+1;
            }
            System.out.println(Arrays.toString(mas));
            for (int i = 0; i < mas.length; i++) {
                if(i%2 == 1){
                    mas[i] = 0;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }

