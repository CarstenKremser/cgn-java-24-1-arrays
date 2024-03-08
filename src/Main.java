
public class Main {
    public static void main(String[] args) {

        // [] -> Array    0,  1, 2
        int [] numbers = {5, 10, 4};

        int sum = numbers[1] + numbers[0];
        System.out.println(sum);
        numbers[2] = 5;

        int [] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 4;
        printNumbers(nums);
    }

    public static void printNumbers (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}