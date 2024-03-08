public class ArrrayBasics {

    public static void main(String[] args) {

        System.out.println("=== Step 1 ===");

        int [] numbers1 = {1,2,3,4,5,6,7,8,9,10};

        printNumbers(numbers1);

        System.out.println("=== Step 2 ===");

        System.out.println(sumUpNumbers(numbers1));

        System.out.println("=== Step 3 ===");

        System.out.println(findMaxNumber(numbers1));

        System.out.println("=== Step 4 ===");

        int [] numbers2 = {11,12,13,14,15,16,17,18,19,20};

        System.out.println("=== Step 5 ===");

        printNumbers(addNumberArrays(numbers1, numbers2));
    }

    public static void printNumbers(int[] numbers) {
        for(int number : numbers) {
            System.out.println(number);
        }
    }

    public static int sumUpNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int findMaxNumber(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    public static int[] addNumberArrays(int[] numbers1, int[] numbers2) {
        int [] sumNumbers = new int[numbers1.length];
        for (int i = 0; i < sumNumbers.length; i++) {
            sumNumbers[i] = numbers1[i] + numbers2[i];
        }
        return sumNumbers;
    }
}
