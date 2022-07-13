import java.util.Random;

public class Home123 {
    //Заполнить массив из двенадцати элементов 1, 2, ... 12.

    public static void main(String[] args) {
        int[] numbers = new int[12];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(5);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();


// Вывести элементы массива на экран в обратном порядке.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

// Определить:
// 1. сумму всех элементов массива;
// 2. произведение всех элементов массива;
// 3. сумму квадратов всех элементов массива;
// 4. сумму шестипервых элементов массива

        int sum = 0;
        int product = 1;
        int squaresSum = 0;
        int firstSixSum =0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
            squaresSum += Math.pow(numbers[i], 2);
            if (i<6){
                firstSixSum += numbers [i];
            }
        }

            System.out.println("сумма всех элементов массива: " + sum);
            System.out.println("произведение всех элементов массива: " + product);
            System.out.println("сумму квадратов всех элементов массива: " + squaresSum);
            System.out.println("суммa шести первых элементов массива: " + firstSixSum);



        }
    }

