import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task2() {
        int [] arr = generateRandomArray();
        int minMonth = 200_001;
        int maxMonth = 99_999;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if(current > maxMonth) {
                maxMonth = current;
            }
            if (current < minMonth) {
                minMonth = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMonth + " рублей. Максимальная сумма трат за день составила " + maxMonth + " рублей.");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        int dayMonth = 30;
        double sum = 0;
        for (int element : arr) {
        sum += element / dayMonth;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рубелй.");
    }
    public static void task4() {
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length - 1; i >= 0; i--) {
            System.out.print(reversFullName[i] + " ");
        }
    }
    }

