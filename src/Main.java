public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }

        System.out.println();
        System.out.print(arr2[0]);
        for (int i = 1; i < arr2.length; i++) {
            System.out.print(", " + arr2[i]);
        }
        
        System.out.println();
        System.out.print(arr3[0]);
        for (int i = 1; i < arr3.length; i++) {
            System.out.print(", " + arr3[i]);
        }
        System.out.println();

        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 2; i > -1; i--) {
            System.out.print(", " + arr[i]);
        }
        System.out.println();
        System.out.print(arr2[arr2.length - 1]);
        for (int i = arr2.length - 2; i > -1; i--){
            System.out.print(", " + arr2[i]);
        }
        System.out.println();
        System.out.print(arr3[arr3.length - 1]);
        for (int i = arr3.length - 2; i > -1; i--) {
            System.out.print(", " + arr3[i]);
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 1) {
                arr3[i] += 1;
            }
            System.out.print(arr3[i] + " ");
        }
    }
}