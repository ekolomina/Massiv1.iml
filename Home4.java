import java.util.Random;

public class Home4 {
//    Дан массив. Вывести на экран сначала его неотрицательные элементы,
//    затем отрицательные.

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random r = new Random();

        for (int i=0; i < numbers.length; i++){
            numbers [i] = r.nextInt(-10, 10);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int i=0; i < numbers.length; i++){
            if (numbers [i]>=0){
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        for (int i=0; i < numbers.length; i++){
            if (numbers [i]<0){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

    }

}
