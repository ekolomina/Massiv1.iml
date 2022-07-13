import java.util.Random;

public class Home5 {
    //Дан массив.
    // Определить:
    // 1. количество максимальных элементов в массиве;
    // 2. количество минимальных элементов в массиве

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random r = new Random();
        int max = 0;
        int min = 9;
        int countMax = 0;
        int countMin = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
            if (numbers[i]>max) {
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers [i];
            }
            System.out.print(numbers [i] + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max){
            countMax++;
        }
            if (numbers[i] == min){
                countMin ++;
            }
        }
        System.out.println();
        System.out.println("количество максимальных элементов в массиве:" + countMax);
        System.out.println("количество минимальных элементов в массиве:" +  countMin);

    }
}
