import java.util.Random;

public class Task10 {
    //Дан двумерный массив.
    // Определить:
    // 1.сумму всех элементов третьей строки массива
    // 2.сумму всех элементов второго столбца массива

    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = r.nextInt(5);
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < numbers[2].length; i++) {
            sum += numbers[2][i];
        }
        System.out.println("сумма всех элементов третьей строки массива: "+sum);

        for (int i = 0; i < 3; i++) {
            sum2 += numbers[i][1];
        }
        System.out.println("сумма всех элементов второго столбца массива: " +sum2);

    }
}





