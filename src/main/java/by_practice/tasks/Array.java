package by_practice.tasks;

public class Array {
    public static void main(String[] args) {
        double[] nums = {1.0, 2.0, 3.0, 4.0};
        char[] operators = {'+', '-', '*', '/'};

        double maxResult = FindMaxHelper(nums, operators, 1, nums[0]);
        System.out.println("Max result: " + maxResult);
    }

    public static double FindMaxHelper(double[] nums, char[] operators, int index, double current) {
        if (index == nums.length) {
            return current;
        }

        double maxResult = Double.NEGATIVE_INFINITY;
        for (char op : operators) {
            double nextValue = nums[index];
            double tempResult = 0.0;

            switch (op) {
                case '+':
                    tempResult = current + nextValue;
                    break;
                case '-':
                    tempResult = current - nextValue;
                    break;
                case '*':
                    tempResult = current * nextValue;
                    break;
                case '/':
                    if (nextValue != 0) {
                        tempResult = current / nextValue;
                    }
                    break;
                default:
                    break;
            }

            double tempMax = FindMaxHelper(nums, operators, index + 1, tempResult);
            maxResult = Math.max(maxResult, tempMax);
        }
        return maxResult;
    }
}
