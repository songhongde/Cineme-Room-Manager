import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        // write your code here
        // selection sort
        int k;      // 记录当前最小的索引
        for (int i = 0; i < numbers.length; i++) {
            k = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[k]) {
                    k = j;
                }
            }
            // swap numbers[i] and numbers[k]
            int min = numbers[k];
            numbers[k] = numbers[i];
            numbers[i] = min;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}