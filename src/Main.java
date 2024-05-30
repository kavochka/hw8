import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        //1.1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //1.2
        double[] numbersDouble = {1.57, 7.654, 9.986};
        //1.3
        int[] arr = new int[]{10, 12};

        System.out.println();
        System.out.println("task 2");
        //2.1
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        //2.2
        System.out.println();
        System.out.println(Arrays.toString(numbersDouble));
        //2.3
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("task 3");
        //3.1
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //3.2
        for (int i = numbersDouble.length - 1; i >= 0; i--) {
            System.out.print(numbersDouble[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("task 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}