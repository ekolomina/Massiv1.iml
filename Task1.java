import java.util.Scanner;

public class Task1 {
    //��������� ������ �� ������ ��������� ����������,
    // ��������� � ���������� ����� ��������� ����������.


    public static void main(String[] args) {
        int[] numbers = new  int[4];
        Scanner sc = new Scanner(System.in);


        for (int i= 0; i< numbers.length; i++){
            numbers [i] = sc.nextInt(6);
        }

        for (int i= 0; i< numbers.length; i++) {
            System.out.println(numbers [i]);
        }
    }
}
