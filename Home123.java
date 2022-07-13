import java.util.Random;

public class Home123 {
    //��������� ������ �� ���������� ��������� 1, 2, ... 12.

    public static void main(String[] args) {
        int[] numbers = new int[12];
        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(5);
            System.out.print(numbers[i] + " ");
        }

        System.out.println();


// ������� �������� ������� �� ����� � �������� �������.
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

// ����������:
// 1. ����� ���� ��������� �������;
// 2. ������������ ���� ��������� �������;
// 3. ����� ��������� ���� ��������� �������;
// 4. ����� ����������� ��������� �������

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

            System.out.println("����� ���� ��������� �������: " + sum);
            System.out.println("������������ ���� ��������� �������: " + product);
            System.out.println("����� ��������� ���� ��������� �������: " + squaresSum);
            System.out.println("����a ����� ������ ��������� �������: " + firstSixSum);



        }
    }

