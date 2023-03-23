import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][][] array = new int[2][2][2];
            System.out.println("Введите число");
            int n = scanner.nextInt();
            System.out.println("Заполнение массива");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++)
                {
                    array[i][j][k]= scanner.nextInt();
                }

            }

        }
        System.out.println("Вывод изменённого массива");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++)
                {
                    array[i][j][k] += n;
                    System.out.print(array[i][j][k]);
                }

            }

        }

    }
}