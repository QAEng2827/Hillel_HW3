import java.util.Scanner;

public class NumberLoop {

    public static void main(String Arg[]) {

        System.out.print("Input amount of numbers: ");
        Scanner inputNum = new Scanner(System.in);
        int amount = inputNum.nextInt();

        int numbers[] = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Input "+ i+1 + " number: ");
            numbers[i] = inputNum.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        System.out.print("Input:");
        for (int i = 0; i < amount; i++) {
            System.out.print(" " + numbers[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        System.out.println("Output: ");
        System.out.println("Sum: " + sum(numbers));
        System.out.println("Multiplication:" + multy(numbers));
        System.out.print("Average: " );
        System.out.printf("%.2f", average(numbers));
        System.out.println();
        System.out.println("Min value: " + minVal(numbers));
        System.out.println("Max value: " + maxVal(numbers));

    }
    private static int maxVal(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        return max;

    }

    private static int minVal(int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        return min;

    }

    private static double average(int[] numbers) {
        int sum = sum(numbers);
        double numerator = (double) sum;
       double aver = numerator/numbers.length;
       return aver;

    }

    private static int multy(int[] numbers) {
        int mult = 1;
        for (int i = 0; i < numbers.length; i++) {
            mult = mult * numbers[i];

        }
        return mult;

    }


    private static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        return sum;

    }
}