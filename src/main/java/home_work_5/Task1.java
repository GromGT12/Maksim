package home_work_5;


     class Task1 {

        public static void main(String args[]){
            int[] array = new int[]{10, 88, 120};

            // Вызов метода getMax () для получения максимального значения
            int max = getMax(array);
            System.out.println("Maximum Value is: "+max);

            // Вызов метода getMin () для получения минимального значения
            int min = getMin(array);
            System.out.println("Minimum Value is: "+min);
        }

        //здесь находим максимум
        public static int getMax(int[] inputArray){
            int maxValue = inputArray[0];
            for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
            }
            return maxValue;
        }

        // здесь находим минимум
        public static int getMin(int[] inputArray){
            int minValue = inputArray[0];
            for(int i=1;i<inputArray.length;i++){
                if(inputArray[i] < minValue){
                    minValue = inputArray[i];
                }
            }
            return minValue;
        }
    }

