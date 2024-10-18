import java.math.BigDecimal;
import java.util.Scanner;

public class task1 {

    // Метод для подсчета четных элементов
    public static int countEvens(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для вычисления разницы между максимальным и минимальным элементами
    public static int differenceMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    // Метод для проверки наличия двух соседних нулевых элементов
    public static boolean hasAdjacentZeros(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Примеры использования методов
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // → 3
        System.out.println(countEvens(new int[]{2, 2, 0})); // → 3
        System.out.println(countEvens(new int[]{1, 3, 5})); // → 0

        System.out.println(differenceMaxMin(new int[]{2, 1, 2, 3, 4})); // → 3
        System.out.println(differenceMaxMin(new int[]{5, 3, 8, -1})); // → 9

        System.out.println(hasAdjacentZeros(new int[]{1, 0, 0, 3})); // → true
        System.out.println(hasAdjacentZeros(new int[]{1, 0, 3})); // → false
    }
}
