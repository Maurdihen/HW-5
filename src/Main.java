public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);
        int max = 0; int min = 10000000;
        for (int i = 0; i < arr.length; ++i) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Средняя сумма трат за месяц: " + (float) sum / arr.length);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}