import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();

        System.out.println(Arrays.toString(expenses));

        System.out.println("Задание 1");
        int sum = 0;
        for (int expense : expenses) {
            sum += expense;

        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задание 2");

        int max = 0;
        int min = 200_000;

        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила "+ max  + " рублей");

        System.out.println("Задание 3");

        double averageExpense = (double) sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}