import java.util.Random;
import java.util.Scanner;

public class Home6 {
   // Составить программу:
    // 1. нахождения минимального значения среди элементов любой строки двумерного массива;
    // 2. нахождения максимального значения среди элементов любого столбца двумерного массива


    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк");
        int rows = sc.nextInt();

        System.out.println("Введите количество столбцов");
        int colums = sc.nextInt();

        int [] [] myArray = new int[rows][colums];


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = r.nextInt(10);
                System.out.print (myArray [i] [j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        // 1
        System.out.println("Введите номер строки для поиска минимума");
        int rowtoFindMin = sc.nextInt();
        int min = 9;
        for (int j = 0; j < myArray[rowtoFindMin].length; j++){
            if (myArray[rowtoFindMin] [j] <min){
                min = myArray[rowtoFindMin] [j];
            }
        }
        System.out.println("Минимум = " + min);

        // 2
        System.out.println("Введите номер столбца для поиска максимума");
        int columtoFindMax = sc.nextInt();
        int max = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray [i] [columtoFindMax] > max){
                max = myArray [i] [columtoFindMax];
            }
        }
        System.out.println("Максимум = " + max);

    }

}
